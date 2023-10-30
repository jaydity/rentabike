DROP DATABASE IF EXISTS RENTABIKE;

CREATE DATABASE RENTABIKE;

USE RENTABIKE;

SET SQL_SAFE_UPDATES = 0;

CREATE TABLE users(
    userId BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    phone VARCHAR(20),
    userFirstName VARCHAR(255),
    userMiddleName VARCHAR(255),
    userLastName VARCHAR(255),
    userAddress VARCHAR(255),
    driversLicenseId VARCHAR(255) UNIQUE NOT NULL,
    numberOfAccidents INT default 0
    ROLE CHAR(10) SET default 'USER'
);

CREATE TABLE bikes(
    registration_number VARCHAR(255) PRIMARY KEY,
    bike_model VARCHAR(255),
    bike_status VARCHAR(255),
    CBook_number VARCHAR(255),
    insurance VARCHAR(255),
    is_available BOOLEAN,
    rate_per_hour BIGINT
);

CREATE TABLE bookings(
    booking_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    customer_id BIGINT,
    registration_number VARCHAR(255),
    booking_time DATETIME,
    pickup_time DATETIME,
    return_time DATETIME,
    down_payment BIGINT,
    total_payment BIGINT,
    FOREIGN KEY (customer_id) REFERENCES users(userId)
);

INSERT INTO USERS VALUES(1,'admin_1','admin','9000000000','adminFname','adminMname','adminLname','India','QWERTY1234',0,'ADMIN');
INSERT INTO USERS VALUES(2,'user_1','user','9000000001','userFname','userMname','userLname','India','QWERTY1235',0,'USER');
INSERT INTO USERS VALUES(3, 'admin_2','admin2','9000000002','adminFname2','adminMname2','adminLname2','India','QWERTY1236',0,'ADMIN');
INSERT INTO USERS VALUES(4, 'user_2','user2','9000000003','userFname2','userMname2','userLname2','India','QWERTY1237',0,'USER');

INSERT INTO BIKES VALUES('MH-01-AB-1234','activa','Available','CBook-1234','Yes',true,10);
INSERT INTO BIKES VALUES('MH-01-AB-1235','Hunter','Available','CBook-1235','Yes',true,20);
INSERT INTO BIKES VALUES('MH-01-AB-1236','ktmDuke','Available','CBook-1236','Yes',true,30);
INSERT INTO BIKES VALUES('MH-01-AB-1237','PassionPro','Available','CBook-1237','Yes',true,20);
INSERT INTO BIKES VALUES('MH-01-AB-1238','splender','Available','CBook-1238','Yes',true,20);
