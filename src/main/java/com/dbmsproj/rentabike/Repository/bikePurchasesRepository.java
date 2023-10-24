package com.dbmsproj.rentabike.Repository;

import com.dbmsproj.rentabike.Models.bikePurchases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class bikePurchasesRepository {
    @Autowired
    private JdbcTemplate tmp;
    public void insertBikePurchase(bikePurchases bp){
        String s="INSERT INTO bikePurchases(registrationNumber,CBookNumber,price,boughtOn,boughtFrom,isSecondHand) VALUES (?,?,?,?,?,?)";
        tmp.update(s,bp.getRegistrationNumber(),bp.getCbookNumber(),bp.getPrice(),bp.getBoughtOn(),bp.getBoughtFrom(),bp.isSecondHand());
    }
    public void deleteBikePurchase(String registrationId){
        String s="DELETE FROM bikePurchases WHERE registrationId=?";
        tmp.update(s,registrationId);
    }
}
