/*
 Use this file to create the database user
 */
CREATE DATABASE rentabike;
CREATE USER 'dbuser'@'localhost' IDENTIFIED BY 'password';
GRANT ALL ON rentabike.* TO 'dbuser'@'localhost';