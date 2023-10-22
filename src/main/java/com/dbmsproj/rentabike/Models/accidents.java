package com.dbmsproj.rentabike.Models;

import org.w3c.dom.Text;

import java.time.LocalDate;
import java.time.LocalTime;

public class accidents {
    private int accidentNumber;
    private LocalDate date;
    private LocalTime time;
    private String place;
    //    private Long booking;
    private Long customer;
    //    private String bike;
    private int coveredByInsurance;
    private Text description;
}
