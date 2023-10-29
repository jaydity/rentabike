package com.dbmsproj.rentabike.Service;

import com.dbmsproj.rentabike.Models.User;
import com.dbmsproj.rentabike.Repository.UserRepository;
import com.dbmsproj.rentabike.security.securityuserdetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class userservice implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        System.out.println("Inside loadUserByUsername");
        User user = userRepository.getUserByUsername(username);
        if (user == null) throw new UsernameNotFoundException("Not found");
        return new securityuserdetails(user);
    }
}
