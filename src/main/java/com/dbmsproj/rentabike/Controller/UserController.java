package com.dbmsproj.rentabike.Controller;

import com.dbmsproj.rentabike.Models.User;
import com.dbmsproj.rentabike.Repository.UserRepository;
import com.dbmsproj.rentabike.Service.userservice;
import com.dbmsproj.rentabike.security.SecurityServices;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {
    private UserRepository userRepository;
    private userservice userService;
    private SecurityServices securityServices;
    @Autowired
    public UserController(UserRepository userRepository, userservice userService, SecurityServices securityServices) {
        this.userRepository = userRepository;
        this.userService = userService;
        this.securityServices=securityServices;
    }

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @RequestMapping(path = "/register")
    public String userRegistration(Model model) {
        model.addAttribute("User",new User());
        System.out.println("donewithuserregistration");
        return "register";
    }
    @PostMapping(path="/register")
    public String RegisterUser(User user){
        System.out.println(user.toString());
        user.setUserId(0L);
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
//    @PostMapping(path="hom")

    @GetMapping(value="/logout")
    public String logoutPage (HttpServletRequest request, HttpServletResponse response, Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/home";
    }
    @RequestMapping("/home")
    public String home(){
        User user=securityServices.findLoggedInUser();
        if(user!=null) return "/homeUser";
        return "home";
    }
    @GetMapping("/homeUser")
    public String homeUser()
    {
        return "homeUser";
    }
    @GetMapping("/profile")
    public String profile(Model model){
        User user=securityServices.findLoggedInUser();
        model.addAttribute("user",user);
        return "profile";
    }
    @GetMapping("/error")
    public String error(){return "error";}

    @GetMapping("/admin")
    public String admin(){return "admin";}

    @GetMapping("/blog")
    public String blog(){
        return "blog";
    }

}
