package com.example.demo.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import com.example.demo.domain.Todo;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class TodoMapperTest {

    @Autowired
    private TodoMapper mapper;


    @BeforeEach
    void setUp() {
    }

    @Test
    void insert() {
        Todo todo = new Todo();
        todo.setTitle("タイトル");
        todo.setDetails("詳細");
        todo.setFinished("0");
        mapper.insert(todo);
    }

    @Test
    void selectById() {
    }
}