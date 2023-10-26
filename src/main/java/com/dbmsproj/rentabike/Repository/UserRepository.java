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
        String sql_query = "INSERT INTO users (username,password,phone,role) VALUES (?,?,?,?)";
        jdbcTemplate.update(sql_query,
                user.getUsername(),
                user.getPassword(),
                user.getPhone(),
                user.getRole()
        );
    }

    private final RowMapper<User> userRowMapper = (rs, rowNum) -> {
        User user = new User();
//        user.setId(rs.getLong("id"));
//          user.setFirst_name(rs.getString("first_name"));
//          user.setLast_name(rs.getString("last_name"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setphone(rs.getString("phone"));
        user.setRole(rs.getString("role"));
        return user;
    };

    public User getUserByUsername(String username){
        String sql = "Select * from users where username = "+"'"+username+"'";
        return jdbcTemplate.queryForObject(sql, userRowMapper);
    }
}
