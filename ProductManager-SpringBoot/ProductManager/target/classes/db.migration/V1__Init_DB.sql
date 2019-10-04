create sequence hibernate_sequence start 1 increment 1;

CREATE TABLE product(
  id int8 NOT NULL,
  name varchar(45) NOT NULL,
  brand varchar(45) NOT NULL,
  madein varchar(45) NOT NULL,
  price float NOT NULL
);