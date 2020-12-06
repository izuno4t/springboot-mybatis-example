DROP TABLE IF EXISTS todo;
CREATE TABLE todo (
    id serial primary key,
    title varchar(200) NOT NULL,
    details TEXT,
    finished char(1) NOT NULL DEFAULT '0'
);

INSERT INTO todo(title, details) VALUES('ミルクをかう','ミルクを2本買う')