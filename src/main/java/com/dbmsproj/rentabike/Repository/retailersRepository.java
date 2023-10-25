package com.dbmsproj.rentabike.Repository;

import com.dbmsproj.rentabike.Models.retailers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class retailersRepository {
    @Autowired
    private JdbcTemplate tmp;

    public void insertRetailer(retailers r){
        String s="INSERT INTO retailers(phoneNumber,address) INTO VALUES(?,?)";
        tmp.update(s,r.getPhoneNumber(),r.getAddress());
    }
    public void deleteRetailer(int retailerId){
        String s="DELETE FROM retailers WHERE retailerId=?";
        tmp.update(s,retailerId);
    }

}
