/*
 Use this file to create the database user
 */
CREATE DATABASE rentabike;
CREATE USER 'dbuser'@'localhost' IDENTIFIED BY 'password';
GRANT ALL ON rentabike.* TO 'dbuser'@'localhost';

/********************************* After running data.sql *********************************/

USE RENTABIKE;

-- Create bikeupdatelogs table with change time attribute
CREATE TABLE IF NOT EXISTS bikeupdatelogs (
    logId INT AUTO_INCREMENT PRIMARY KEY,
    registration_number VARCHAR(255),
    is_available BOOLEAN,
    rate_per_hour BIGINT,
    changetime TIMESTAMP DEFAULT CURRENT_TIMESTAMP
--     FOREIGN KEY (registration_number) REFERENCES bikes(registration_number)
    );


DELIMITER //

CREATE TRIGGER before_update_bikes
    BEFORE UPDATE ON bikes
    FOR EACH ROW
BEGIN
    INSERT INTO bikeupdatelogs (registration_number, is_available, rate_per_hour,changetime)
    VALUES (OLD.registration_number, OLD.is_available, OLD.rate_per_hour,now());
END;

//

DELIMITER ;


CREATE TABLE IF NOT EXISTS bikesdeletelogs (
                                               logId int primary key auto_increment,
                                               registration_number VARCHAR(255),
    deletetime TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );

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

CREATE TRIGGER after_insert_accidents
    AFTER INSERT ON accidents
    FOR EACH ROW
BEGIN
    UPDATE Users SET Users.numberofAccidents = Users.numberofAccidents+1 WHERE USERID = NEW.USERID;
END;

//
delimiter //

delimiter //
create trigger after_update_users
    after update on users
    for each row
begin
    if new.numberOfAccidents <> old.numberOfAccidents then
		if new.numberOfAccidents > 2 then
			INSERT INTO blocklist (userId, blocktime)
			VALUES (OLD.userId, now());
end if;
end if;
end;

//
delimiter ;
