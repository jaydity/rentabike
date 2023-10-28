package com.dbmsproj.rentabike.Models;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class admin {
    private int adminId;
    private String adminName;
    private String password;
    private String phoneNumber;
    private String email;




    public admin(int adminId, String adminName, String password, String phoneNumber, String email) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }

    public admin(String adminName, String password, String phoneNumber, String email) {
        this.adminName = adminName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getAdminId() {
        return adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String password) {
        this.password = password;
    }
}
