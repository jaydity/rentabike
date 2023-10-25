package com.dbmsproj.rentabike.Repository;

import com.dbmsproj.rentabike.Models.bikes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class bikesRepository {
    @Autowired
    private JdbcTemplate tmp;
    public void insertBike(bikes b){
        String s="INSERT INTO bikes(registrationNumber,bikeModel,bikeStatus,CBookNumber,Insurance,isAvailable, ratePerHour) VALUES(?,?,?,?,?,?)";
        tmp.update(s,b.getRegistrationNumber(),b.getBikeModel(),b.getBikeStatus(),b.getCBookNumber(),b.getInsurance(),b.isAvailable(), b.getRatePerHour());
    }
    public void deleteBike(String registrationNumber){
        String s="DELETE FROM bikes WHERE registrationNumber=?";
        tmp.update(s,registrationNumber);
    }
    public void updateBike(String registrationNumber,String availability){
        String s="UPDATE bikes SET isAvailable=? WHERE registrationNumber=?";
        tmp.update(s,availability,registrationNumber);
    }

    public long selectRatePerHour(String registrationNumber){
        String s="SELECT ratePerHour FROM bikes WHERE bikes.registrationNumber=?";
        return tmp.queryForObject(s,long.class,registrationNumber);
    }
}
