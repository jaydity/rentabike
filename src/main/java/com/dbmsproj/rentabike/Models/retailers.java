package com.dbmsproj.rentabike.Models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class retailers {
    private int retailerId;
    private String phoneNumber;
    private String address;

    public retailers(int retailerId, String phoneNumber, String address) {
        this.retailerId = retailerId;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public retailers(String phoneNumber, String address) {
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getRetailerId() {
        return retailerId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setRetailerId(int retailerId) {
        this.retailerId = retailerId;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
