package com.dbmsproj.rentabike.service;

import com.dbmsproj.rentabike.Models.User;
import com.dbmsproj.rentabike.repository.UserRepository;
import com.dbmsproj.rentabike.repository.customerRepository;
import com.dbmsproj.rentabike.security.securityuserdetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("Check")

public class userservice implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.getUserByUsername(username);
        if (user == null) throw new UsernameNotFoundException("Not found");
        return new securityuserdetails(user);
    }
}
