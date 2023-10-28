package com.dbmsproj.rentabike.Controller;

import com.dbmsproj.rentabike.Models.bikes;
import com.dbmsproj.rentabike.Repository.bikesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BikeController {
    private final bikesRepository BikesRepo;
    @Autowired
    public BikeController(bikesRepository BikesRepo){
        this.BikesRepo=BikesRepo;
    }
    @GetMapping("/availableBikes")
    public String getAvailableBikes(Model model){
        System.out.println("Inside availableBikes");
        List<bikes> availableBikes=BikesRepo.getAllAvailableBikes();
        model.addAttribute("availableBikes",availableBikes);
        return "availableBikes";
    }
    @GetMapping("/bikes")
    public String getAllBikes(Model model){
        List<bikes> allBikes=BikesRepo.getAllBikes();
        model.addAttribute("allBikes",allBikes);
        return "bikes";
    }
    @PostMapping("/addBike")
    public String addBike(
                           @RequestParam("registrationNumber") String registrationNumber,
                           @RequestParam("bikeModel") String bikeModel,
                           @RequestParam("bikeStatus") String bikeStatus,
                           @RequestParam("CBookNumber") String CBookNumber,
                           @RequestParam("Insurance") String Insurance,
                           @RequestParam("isAvailable") boolean isAvailable,
                           @RequestParam("ratePerHour") long ratePerHour
                         ){
        System.out.println("inside addBike");
        bikes bike=new bikes(registrationNumber,bikeModel,bikeStatus,CBookNumber,Insurance,isAvailable,ratePerHour);
        BikesRepo.insertBike(bike);
        return "bikes";
    }
    @RequestMapping("/addBike")
    public String goToAddBike(){
        return "addBike";
    }

    @GetMapping("/payment")
    public String goToPayment(){
        return "payment";
    }
}
