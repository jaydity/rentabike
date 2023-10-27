package com.dbmsproj.rentabike.Repository;

import com.dbmsproj.rentabike.Models.bikes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class bikesRepository {
    @Autowired
    private JdbcTemplate tmp;
    public void insertBike(bikes b){
        String s="INSERT INTO RENTABIKE.bikes(registration_number,bike_model,bike_status,CBook_number,insurance,is_available, rate_per_hour) VALUES(?,?,?,?,?,?,?)";
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
        String s="SELECT ratePerHour FROM bikes WHERE registrationNumber=?";
        return tmp.queryForObject(s,long.class,registrationNumber);
    }

    private static class BikeRowMapper implements RowMapper<bikes>{
        @Override
        public bikes mapRow(ResultSet rs, int rowNum) throws SQLException {
            bikes bike = new bikes();
            bike.setRegistrationNumber(rs.getString("registration_number"));
            bike.setBikeModel(rs.getString("bike_model"));
            bike.setBikeStatus(rs.getString("bike_status"));
            bike.setCBookNumber(rs.getString("CBook_number"));
            bike.setInsurance(rs.getString("insurance"));
            bike.setAvailable(rs.getBoolean("is_available"));
            bike.setRatePerHour(rs.getLong("rate_per_hour"));
            return bike;
        }
    }

    public List<bikes> getAllAvailableBikes(){
        String s="SELECT * FROM RENTABIKE.bikes WHERE is_available=1";
        return tmp.query(s,new BikeRowMapper());
    }
    public List<bikes> getAllBikes(){
        String s="SELECT * FROM RENTABIKE.bikes";
        return tmp.query(s,new BikeRowMapper());
    }

}
