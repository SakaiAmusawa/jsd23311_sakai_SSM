CREATE DATABASE IF NOT EXISTS mybatisdb DEFAULT CHARSET = UTF8;
USE mybatisdb;

DROP TABLE IF EXISTS customers;
CREATE TABLE customers
(
    cust_id   VARCHAR(32) PRIMARY KEY,
    cust_tel  VARCHAR(32),
    cust_name VARCHAR(64),
    address   VARCHAR(128)
) CHARSET = UTF8;
INSERT INTO customers
VALUES ('0001', '13512345678', 'Jerry', '北京'),
       ('0002', '13222334455', 'Tom', '成都'),
       ('0003', '13811112222', 'Dekie', '北京');

DROP TABLE IF EXISTS user_orders;
CREATE TABLE user_orders
(
    order_id     VARCHAR(32) primary key,
    cust_id      VARCHAR(32),
    order_date   DATETIME,
    status       VARCHAR(10),
    products_num INT,
    amt          DOUBLE(10, 2)
) CHARSET = UTF8;
INSERT INTO user_orders
VALUES ('202301010001', '0001', '1999-01-01 00:00:00', '1', 2, 100);
INSERT INTO user_orders
VALUES ('202301010002', '0001', '1999-01-01 00:00:00', '1', 1, 200);
INSERT INTO user_orders
VALUES ('202301020001', '0002', '1999-01-01 00:00:00', '4', 1, 70);
INSERT INTO user_orders
VALUES ('202301020002', '0002', '1999-01-01 00:00:00', '2', 3, 450.34);
INSERT INTO user_orders
VALUES ('202301020003', '0003', '1999-01-01 00:00:00', '3', 4, 800.45);
