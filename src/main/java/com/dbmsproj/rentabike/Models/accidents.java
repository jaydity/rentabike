package com.dbmsproj.rentabike.Models;

import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.Text;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class accidents {
    private int accidentNumber;
    private LocalDate date;
    private LocalTime time;
    private String place;
    private Long customer;
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

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getPlace() {
        return place;
    }

    public Long getCustomer() {
        return customer;
    }

    public int getCoveredByInsurance() {
        return coveredByInsurance;
    }

    public Text getDescription() {
        return description;
    }

    public void setAccidentNumber(int accidentNumber) {
        this.accidentNumber = accidentNumber;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setCustomer(Long customer) {
        this.customer = customer;
    }

    public void setCoveredByInsurance(int coveredByInsurance) {
        this.coveredByInsurance = coveredByInsurance;
    }

    public void setDescription(Text description) {
        this.description = description;
    }
}
