package com.dbmsproj.rentabike.Models;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class bookings {
    private Long bookingId;
    private Long customerId;
    private String RegistrationNumber;
    private LocalDateTime bookingTime;
    private LocalDateTime pickupTime;
    private LocalDateTime returnTime;
    private int downPayment;
    private int TotalPayment;
    private int issuedBy;
    private TextArea feedback;
}
