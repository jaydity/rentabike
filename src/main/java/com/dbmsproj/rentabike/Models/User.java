package com.dbmsproj.rentabike.Models;

import lombok.Getter;
import lombok.Setter;

//@Entity
@Getter
@Setter

public class User {
//    @Id
//    private Long userId;
//    @Column(unique = true
    private String username;
    private String password;
    private String email;
    private String role;
//    private Long customerId;

    public User(String username, String password, String email, String Role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role=Role;
//        this.customerId = customer;
    }

    public User() {

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

    public void setEmail(String email) {
        this.email = email;
    }

//    public Long getCustomer() {
//        return customerId;
//    }
//
//    public void setCustomer(Long customer) {
//        this.customerId = customer;
//    }

    public void setRole(String role) {
        this.role = role;
    }
}
