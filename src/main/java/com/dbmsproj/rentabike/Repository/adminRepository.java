package com.dbmsproj.rentabike.Repository;

import com.dbmsproj.rentabike.Models.admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class adminRepository {
    @Autowired
    private JdbcTemplate tmp;

    public void insertAdmin(admin a){
        String x="INSERT INTO admin(adminName,phoneNumber,email,password) VALUES (?,?,?,?)";
        tmp.update(x,a.getAdminName(),a.getPhoneNumber(),a.getEmail(),a.getPassword());
    }
    public void deleteAdmin(String a){
        String x="DELETE FROM admin WHERE email=?";
        tmp.update(x,a);
    }
}
