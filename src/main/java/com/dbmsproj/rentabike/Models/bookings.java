package com.dbmsproj.rentabike.Models;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
public class bookings {
    private Long bookingId;
    private Long customerId;
    private String RegistrationNumber;
    private LocalDateTime bookingTime;
    private LocalDateTime pickupTime;
    private LocalDateTime returnTime;
    private int downPayment;
    private int TotalPayment;
//    private int issuedBy;
    private TextArea feedback;

    public bookings(
                Long bookingId, Long customerId, String registrationNumber, LocalDateTime bookingTime,
                LocalDateTime pickupTime, LocalDateTime returnTime, int downPayment, int totalPayment,
                int issuedBy, TextArea feedback
            ) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.RegistrationNumber = registrationNumber;
        this.bookingTime = bookingTime;
        this.pickupTime = pickupTime;
        this.returnTime = returnTime;
        this.downPayment = downPayment;
        this.TotalPayment = totalPayment;
//        this.issuedBy = issuedBy;
        this.feedback = feedback;
    }

    public bookings(Long customerId, String registrationNumber, LocalDateTime bookingTime, LocalDateTime pickupTime, LocalDateTime returnTime, int downPayment, int totalPayment, int issuedBy, TextArea feedback) {
        this.customerId = customerId;
        RegistrationNumber = registrationNumber;
        this.bookingTime = bookingTime;
        this.pickupTime = pickupTime;
        this.returnTime = returnTime;
        this.downPayment = downPayment;
        TotalPayment = totalPayment;
//        this.issuedBy = issuedBy;
        this.feedback = feedback;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getRegistrationNumber() {
        return RegistrationNumber;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public LocalDateTime getPickupTime() {
        return pickupTime;
    }

    public LocalDateTime getReturnTime() {
        return returnTime;
    }

    public int getDownPayment() {
        return downPayment;
    }

    public int getTotalPayment() {
        return TotalPayment;
    }

//    public int getIssuedBy() {
//        return issuedBy;
//    }

    public TextArea getFeedback() {
        return feedback;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.RegistrationNumber = registrationNumber;
    }

    public void setBookingTime(LocalDateTime bookingTime) {
        this.bookingTime = bookingTime;
    }

    public void setPickupTime(LocalDateTime pickupTime) {
        this.pickupTime = pickupTime;
    }

    public void setReturnTime(LocalDateTime returnTime) {
        this.returnTime = returnTime;
    }

    public void setDownPayment(int downPayment) {
        this.downPayment = downPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.TotalPayment = totalPayment;
    }

//    public void setIssuedBy(int issuedBy) {
//        this.issuedBy = issuedBy;
//    }

    public void setFeedback(TextArea feedback) {
        this.feedback = feedback;
    }
}
