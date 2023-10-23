package com.dbmsproj.rentabike.Models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class bikePurchases {
    private String registrationNumber;
    private String CbookNumber;
    private int price;
    private LocalDate boughtOn;
    private int boughtFrom;
    private boolean isSecondHand;

    public bikePurchases(String registrationNumber, String cbookNumber, int price, LocalDate boughtOn, int boughtFrom, boolean isSecondHand) {
        this.registrationNumber = registrationNumber;
        this.CbookNumber = cbookNumber;
        this.price = price;
        this.boughtOn = boughtOn;
        this.boughtFrom = boughtFrom;
        this.isSecondHand = isSecondHand;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getCbookNumber() {
        return CbookNumber;
    }

    public void setCbookNumber(String cbookNumber) {
        this.CbookNumber = cbookNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getBoughtOn() {
        return boughtOn;
    }

    public void setBoughtOn(LocalDate boughtOn) {
        this.boughtOn = boughtOn;
    }

    public int getBoughtFrom() {
        return boughtFrom;
    }

    public void setBoughtFrom(int boughtFrom) {
        this.boughtFrom = boughtFrom;
    }

    public boolean isSecondHand() {
        return isSecondHand;
    }

    public void setSecondHand(boolean secondHand) {
        this.isSecondHand = secondHand;
    }
}
