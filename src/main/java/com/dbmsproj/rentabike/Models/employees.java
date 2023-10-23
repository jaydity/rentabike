package com.dbmsproj.rentabike.Models;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class employees {
    private int employeeId;
    private String employeeName;
    private String phoneNumber;
    private String email;
    private String address;



    public employees(int employeeId, String employeeName, String phoneNumber, String email, String address) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;

    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
