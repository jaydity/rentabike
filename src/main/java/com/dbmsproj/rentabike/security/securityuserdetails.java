package com.dbmsproj.rentabike.security;

import com.dbmsproj.rentabike.Models.User;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collection;

@Getter
public class securityuserdetails implements UserDetails{

    private User user;

    public void setUser(User user) {
        System.out.println("Hello, World2!");
        this.user = user;
    }

    public securityuserdetails(User user){
        System.out.println("Hello, World1!");
        this.user = user;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        System.out.println("Hello, World3!");
        return null;
    }

    @Override
    public String getPassword() {

        System.out.println("Hello, World4!");
        return user.getPassword();
    }


    @Override
    public String getUsername() {
        System.out.println("Hello, World5!");
        return user.getUsername();
    }
//    @Override/,hy
//    public String getPhone() {
//        return user.getPhone();
//    }
//    @Override
//    public String getRole() {
//        return user.getRole();
//    }


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
//        if (user.blocklist() != null) {
//            LocalDate activeFrom = user.getBlocklist().getActiveFrom();
//            LocalDate now = LocalDate.now();
//            return now.isAfter(activeFrom);
//        }
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
