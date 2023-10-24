package com.dbmsproj.rentabike.Repository;

import com.dbmsproj.rentabike.Models.bookings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Repository
public class bookingsRepository {
    @Autowired
    private JdbcTemplate tmp;

    public void insertBooking(bookings b){
        String s="INSERT INTO bookings(customerId,RegistrationNumber,bookingTime,pickupTime,returnTime,downPayment,TotalPayment,feedback) VALUES(?,?,?,?,?,?,?,?)";
        tmp.update(s,b.getCustomerId(),b.getRegistrationNumber(),b.getBookingTime(),b.getPickupTime(),b.getReturnTime(),b.getDownPayment(),b.getTotalPayment(),b.getFeedback());
    }
    public void updateBooking(bookings b){
        String s="UPDATE bookings SET bookingTime=?,returnTime=? WHERE bookingId=?";
        tmp.update(s,b.getBookingTime(),b.getReturnTime(),b.getBookingId());
    }
    public void deleteBooking(Integer bookingId){
        String s="DELETE FROM bookings WHERE bookingId=?";
        tmp.update(s,bookingId);
    }
}
