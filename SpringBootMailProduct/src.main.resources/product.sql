create database if not exists db_product default charset utf8;

CREATE TABLE products(
 pid INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
 pname VARCHAR(200),
 ptype VARCHAR(50),
 price DOUBLE,
 createTime TIMESTAMP
);