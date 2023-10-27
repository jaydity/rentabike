package com.dbmsproj.rentabike.Repository;

import com.dbmsproj.rentabike.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service

public class UserRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void AddUser(User user){
        System.out.println("Inside AddUser");

        String sql_query = "INSERT INTO RENTABIKE.users(username,password,phone,UserFirstName,UserMiddleName,UserLastName,UserAddress,driversLicenseId) VALUES (?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql_query,
                user.getUsername(),
                user.getPassword(),
                user.getPhone(),
                //user.getUserId(),
                user.getUserFirstName(),
                user.getUserMiddleName(),
                user.getUserLastName(),
                user.getUserAddress(),
                user.getDriversLicenseId()
                // user.getNumberOfAccidents()
        );
        System.out.println("User Added");
    }

    private final RowMapper<User> userRowMapper = (rs, rowNum) -> {
        User user = new User();
//        user.setId(rs.getLong("id"));
//          user.setFirst_name(rs.getString("first_name"));
//          user.setLast_name(rs.getString("last_name"));
        user.setUserId(rs.getLong("UserId"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setphone(rs.getString("phone"));
        //user.setRole(rs.getString("role"));
        user.setUserFirstName(rs.getString("UserFirstName"));
        user.setUserMiddleName(rs.getString("UserMiddleName"));
        user.setUserLastName(rs.getString("UserLastName"));
        user.setUserAddress(rs.getString("UserAddress"));
        user.setDriversLicenseId(rs.getString("DriversLicenseId"));
        user.setNumberOfAccidents(rs.getInt("NumberOfAccidents"));

        return user;
    };

    public User getUserByUsername(String username){
        System.out.println("Inside getUserByUsername");
        String sql = "Select * from users where username = ?";
        return jdbcTemplate.queryForObject(sql, userRowMapper);
    }
}
