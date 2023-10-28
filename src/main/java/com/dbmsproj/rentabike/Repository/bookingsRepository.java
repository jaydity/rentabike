package com.dbmsproj.rentabike.Repository;

import com.dbmsproj.rentabike.Models.bookings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;


import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

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
    public void deleteBooking(Long bookingId){
        String s="DELETE FROM bookings WHERE bookingId=?";
        tmp.update(s,bookingId);
    }

    public List<bookings> getBookings(String username){
        String s = "SELECT * FROM BOOKINGS WHERE USERNAME=?";
        return tmp.query(s, new BeanPropertyRowMapper<>(bookings.class), username);
    }


    public List<bookings> findByUsername(String username) {
        String sql = "SELECT * FROM BOOKINGS WHERE USERNAME=?";
        return tmp.query(sql, new Object[]{username}, new BeanPropertyRowMapper<>(bookings.class));
    }
}
