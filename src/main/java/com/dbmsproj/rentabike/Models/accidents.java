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

    public accidents(int accidentNumber, LocalDate date, LocalTime time, String place, Long customer, int coveredByInsurance, Text description) {
        this.accidentNumber = accidentNumber;
        this.date = date;
        this.time = time;
        this.place = place;
        this.customer = customer;
        this.coveredByInsurance = coveredByInsurance;
        this.description = description;
    }

    public accidents(LocalDate date, LocalTime time, String place, Long customer, int coveredByInsurance, Text description) {
        this.date = date;
        this.time = time;
        this.place = place;
        this.customer = customer;
        this.coveredByInsurance = coveredByInsurance;
        this.description = description;
    }

    public int getAccidentNumber() {
        return accidentNumber;
    }

    public void setAccidentNumber(int accidentNumber) {
        this.accidentNumber = accidentNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Long getCustomer() {
        return customer;
    }

    public void setCustomer(Long customer) {
        this.customer = customer;
    }

    public int getCoveredByInsurance() {
        return coveredByInsurance;
    }

    public void setCoveredByInsurance(int coveredByInsurance) {
        this.coveredByInsurance = coveredByInsurance;
    }

    public Text getDescription() {
        return description;
    }

    public void setDescription(Text description) {
        this.description = description;
    }
}
