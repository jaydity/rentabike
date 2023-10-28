
package com.dbmsproj.rentabike.Controller;

import com.dbmsproj.rentabike.Models.bookings;
import com.dbmsproj.rentabike.Service.bookingsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

import java.util.List;


@Controller
public class BookingController {

    @Autowired
    private bookingsService bookingsservice;

    @GetMapping("/bookings/{username}")
    public String getBookings(@PathVariable String username, Model model) {
        List<bookings> bookings = bookingsservice.getBookings(username);
        model.addAttribute("bookings", bookings);
        return "bookingList";
    }
}

