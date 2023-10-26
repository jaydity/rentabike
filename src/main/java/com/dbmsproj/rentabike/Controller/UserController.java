package com.dbmsproj.rentabike.Controller;

import com.dbmsproj.rentabike.Models.User;
import com.dbmsproj.rentabike.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @GetMapping(path="/register")
    public String Register(){
        return "register";
    }
    @PostMapping(path="/register")
    public String RegisterUser(@RequestParam("id") Long id,
                               @RequestParam("username") String username,
                               @RequestParam("password") String password,
                               @RequestParam("phone") String phone,
                               @RequestParam("role") String role){
        User user = new User(username,password,phone,role);
        userRepository.AddUser(user);
        return "home";
    }

    @GetMapping(path="/signin")
    public String usersignIn(){
        return "login";
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }




}
