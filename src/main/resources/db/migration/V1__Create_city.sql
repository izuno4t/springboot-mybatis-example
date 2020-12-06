DROP TABLE IF EXISTS city;
CREATE TABLE city (
    id serial primary key,
    name varchar(200),
    state varchar(2),
    country varchar(2)
);
-- init data
insert into city (name, state, country) values ('San Francisco', 'CA', 'US');
