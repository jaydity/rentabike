/*
 Use this file to create the database user
 */
CREATE DATABASE rentabike;
CREATE USER 'dbuser'@'localhost' IDENTIFIED BY 'password';
GRANT ALL ON rentabike.* TO 'dbuser'@'localhost';

/********************************* After running data.sql *********************************/

USE RENTABIKE;

-- Create bikeupdatelogs table with changetime attribute
CREATE TABLE IF NOT EXISTS bikeupdatelogs (
    logId INT AUTO_INCREMENT PRIMARY KEY,
    registration_number VARCHAR(255),
    is_available BOOLEAN,
    rate_per_hour BIGINT,
    changetime TIMESTAMP DEFAULT CURRENT_TIMESTAMP
--     FOREIGN KEY (registration_number) REFERENCES bikes(registration_number)
    );
-- select * from bikes;

DELIMITER //

-- drop trigger before_update_bikes//
CREATE TRIGGER before_update_bikes
    BEFORE UPDATE ON bikes
    FOR EACH ROW
BEGIN
    INSERT INTO bikeupdatelogs (registration_number, is_available, rate_per_hour,changetime)
    VALUES (OLD.registration_number, OLD.is_available, OLD.rate_per_hour,now());
END;

//

DELIMITER ;

-- Insert data into bikes table
-- INSERT INTO bikes (registration_number, bike_model, bike_status, CBook_number, insurance, is_available, rate_per_hour)
-- VALUES
--     ('ABC123', 'Mountain Bike', 'Available', 'CB001', 'Yes', TRUE, 20),
--     ('DEF456', 'Road Bike', 'Rented', 'CB002', 'No', FALSE, 25),
--     ('GHI789', 'City Bike', 'Available', 'CB003', 'Yes', TRUE, 15);
--
-- update bikes
-- set is_available=1 where registration_number="DEF456";
-- select * from bikeupdatelogs;
-- drop table bikesdeletelogs;

CREATE TABLE IF NOT EXISTS bikesdeletelogs (
                                               logId int primary key auto_increment,
                                               registration_number VARCHAR(255),
    deletetime TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );

-- Create before delete trigger
DELIMITER //

CREATE TRIGGER before_delete_bikes
    BEFORE DELETE ON bikes
    FOR EACH ROW
BEGIN
    INSERT INTO bikesdeletelogs (registration_number)
    VALUES (OLD.registration_number);
END;

//

DELIMITER ;
