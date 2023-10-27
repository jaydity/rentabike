package com.dbmsproj.rentabike.Controller;

import com.dbmsproj.rentabike.Models.User;
import com.dbmsproj.rentabike.Repository.UserRepository;
import com.dbmsproj.rentabike.Service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    private UserRepository userRepository;
    @Autowired
    private userservice userService;


    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @RequestMapping(path = "/register")
    public String userRegistration() {
        System.out.println("donewithuserregistration");
        return "register";
    }
    @PostMapping(path="/register")
    public String RegisterUser(
                               @RequestParam("username") String username,
                               @RequestParam("password") String password,
                               @RequestParam("phone") String phone,
                               @RequestParam("userFirstName") String UserFirstName,
                               @RequestParam("userMiddleName") String UserMiddleName,
                               @RequestParam("userLastName") String UserLastName,
                               @RequestParam("userAddress") String UserAddress,
                               @RequestParam("driversLicenseId") String driversLicenseId
                               ){
        System.out.println("Inside RegisterUser");
        System.out.println(username+" " + password+" "+phone+" "+UserFirstName+" "+UserMiddleName+" "+UserLastName+" "+UserAddress+" "+driversLicenseId);
        User user = new User(username,password,phone,UserFirstName,UserMiddleName,UserLastName,UserAddress,driversLicenseId,0);
        userRepository.AddUser(user);
        System.out.println("User Added");
        return "home";
    }
    @RequestMapping(path="/")
    public String defaulthome() {
        return "home";
    }

    @GetMapping(path={"/login"})
    public String userlogIn(){
        System.out.println("started user login");
         return "login";
    }

    @RequestMapping("/home")
    public String home(){
        return "home";
    }

}
