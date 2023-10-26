package com.dbmsproj.rentabike.Models;

import lombok.*;

//@Entity
@Getter
@Setter
@Data
//@AllArgsConstructor

public class User {
//    @Id
//    private Long userId;
//    @Column(unique = true
    private String username;
    private String password;
    private String phone;
    //private String role;
    private Long UserId;
    private String UserFirstName;
    private String UserMiddleName;
    private String UserLastName;
    private String UserAddress;
    private String driversLicenseId;
    private int numberOfAccidents;

//    private Long customerId;

    public User(String username, String password, String phone,Long UserId, String UserFirstName, String UserMiddleName,
                String UserLastName, String UserAddress, String driversLicenseId, int numberOfAccidents) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.UserId=UserId;
        //this.role=Role;
        this.UserFirstName = UserFirstName;
        this.UserMiddleName = UserMiddleName;
        this.UserLastName = UserLastName;
        this.UserAddress = UserAddress;
        this.driversLicenseId = driversLicenseId;
        this.numberOfAccidents = numberOfAccidents;
//        this.customerId = customer;
    }

    public User() {

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }
    public Long getUserId() {
        return UserId;
    }


    //    public String getRole() {return role;}
    public String getUserFirstName() {return UserFirstName;}
    public String getUserMiddleName() {
        return UserMiddleName;
    }

    public String getUserLastName() {
        return UserLastName;
    }

    public String getUserAddress() {
        return UserAddress;
    }
    public String getDriversLicenseId() {
        return driversLicenseId;
    }

    public int getNumberOfAccidents() {
        return numberOfAccidents;
    }
    //    public username(Long userId, String username, String password, String email, Long customer) {
//        this.userId = userId;
//        this.username = username;
//        this.password = password;
//        this.email = email;
//        this.customer = customer;
//    }

//    public Long getUserId() {
//        return userId;
//    }

//    public void setUserId(Long userId) {
//        this.userId = userId;
//    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }
    public void setUserId(Long UserId){ this.UserId=UserId;}
    public void setUserFirstName(String userFirstName) {
        this.UserFirstName = userFirstName;
    }

    public void setUserMiddleName(String userMiddleName) {
        this.UserMiddleName = userMiddleName;
    }

    public void setUserLastName(String userLastName) {
        this.UserLastName = userLastName;
    }

    public void setUserAddress(String UserAddress) {
        this.UserAddress = UserAddress;
    }
    public void setDriversLicenseId(String driversLicenseId) {
        this.driversLicenseId = driversLicenseId;
    }

    public void setNumberOfAccidents(int numberOfAccidents) {
        this.numberOfAccidents = numberOfAccidents;
    }


//    public Long getCustomer() {
//        return customerId;
//    }
//
//    public void setCustomer(Long customer) {
//        this.customerId = customer;
//    }

    //public void setRole(String role) {this.role = role;}
}
