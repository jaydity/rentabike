package com.dbmsproj.rentabike.Controller;

import com.dbmsproj.rentabike.Models.bookings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import com.dbmsproj.rentabike.Service.bookingsService;

import java.util.List;


@Controller
public class BookingController {

    @Autowired
    private bookingsService bookingsService;

    @GetMapping("/bookings/{username}")
    public String getBookings(@PathVariable("username") String username, Model model) {
        List<bookings> bookings = bookingsService.getBookings(username);
        model.addAttribute("bookings", bookings);
        return "bookings";
    }


}