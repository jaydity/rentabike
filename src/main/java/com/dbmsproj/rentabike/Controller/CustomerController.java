package com.dbmsproj.rentabike.Controller;

import com.dbmsproj.rentabike.Models.customers;
import com.dbmsproj.rentabike.Repository.customerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class customerController {
//    private customerRepository customerRepository;
//
//    @Autowired
//    public CustomerController(customerRepository customerRepository){
//        this.customerRepository = customerRepository;
//    }
//    @GetMapping(path="/register")
//    public String Register(){
//        return "register";
//    }
//    @PostMapping(path="/register")
//    public String RegisterCustomer(@RequestParam("customerFirstName") String customerFirstName,
//                               @RequestParam("customerMiddleName") String customerMiddleName,
//                               @RequestParam("customerLastName") String customerLastName,
//                               @RequestParam("customerAddress") String customerAddress,
//                               @RequestParam("phone") String phone,
//                               @RequestParam("driversLicenseId") String driversLicenseId,
//                               @RequestParam("numberOfAccidents") int numberOfAccidents){
//        customers customer = new customers(customerFirstName,customerMiddleName,customerLastName,customerAddress,phone,driversLicenseId,numberOfAccidents);
//        customerRepository.insertCustomer(customer);
//        return "home";
//    }
//    @GetMapping(path="/signin")
//    public String usersignIn(){
//        return "login";
//    }
}
