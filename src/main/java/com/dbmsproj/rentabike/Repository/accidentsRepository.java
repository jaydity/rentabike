package com.dbmsproj.rentabike.Repository;

import com.dbmsproj.rentabike.Models.accidents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class accidentsRepository {
    @Autowired
    private JdbcTemplate tmp;
    public void insertAccident(accidents a){
        String s="INSERT INTO accidents(date,time,place,customer,coveredByInsurance,description) VALUES(?,?,?,?,?,?)";
        tmp.update(s,a.getDate(),a.getTime(),a.getPlace(),a.getCustomer(),a.getCoveredByInsurance(),a.getDescription());
    }
    public void deleteAccident(int accidentNumber){
        String s="DELETE FROM accidents WHERE accidentNumber=?";
        tmp.update(s,accidentNumber);
    }
}
