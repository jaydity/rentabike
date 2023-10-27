package com.dbmsproj.rentabike.Controller;

import com.dbmsproj.rentabike.Models.bikes;
import com.dbmsproj.rentabike.Repository.bikesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
