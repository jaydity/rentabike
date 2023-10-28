package com.dbmsproj.rentabike.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;



@Controller
public class BookingController {

    @Autowired
    private bookingsService bookingsService;

    @GetMapping("/bookings/{username}")
    public String getBookings(@PathVariable String username, Model model) {
        List<booking> bookings = bookingsService.getBookings(username);
        model.addAttribute("bookings", bookings);
        return "bookingList";
    }
}