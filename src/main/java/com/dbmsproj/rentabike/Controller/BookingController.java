
package com.dbmsproj.rentabike.Controller;

import com.dbmsproj.rentabike.Models.User;
import com.dbmsproj.rentabike.Models.bookings;
import com.dbmsproj.rentabike.Repository.UserRepository;
import com.dbmsproj.rentabike.Service.bookingsService;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.time.LocalDateTime;
import java.util.List;


@Controller
public class BookingController {

    @Autowired
    private bookingsService bookingsservice;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/bookings/{username}")
    public String getBookings(@PathVariable("username") String username, Model model) {
        List<bookings> bookings = bookingsservice.getBookings(username);
        model.addAttribute("bookings", bookings);
        return "bookingList";
    }

//    @PostMapping("/payment")
//    public String bookBike(@RequestParam("reg_no") String reg_no, HttpSession session){
//        session.setAttribute("reg_no", reg_no);
//
//
//
//    }
    @GetMapping("/payment/success")
    @ResponseBody
    public String success(HttpSession session, @AuthenticationPrincipal UserDetails userDetails){
        String reg_no = (String)session.getAttribute("reg_no");
        LocalDateTime pickupDate = LocalDateTime.parse((String)session.getAttribute("pickupDate"));
        LocalDateTime returnDate = LocalDateTime.parse((String)session.getAttribute("returnDate"));
        bookings b = new bookings();
        b.setBookingTime(LocalDateTime.now());
        b.setPickupTime(pickupDate);
        b.setReturnTime(returnDate);
        b.setRegistrationNumber(reg_no);
        User user = userRepository.getUserByUsername(userDetails.getUsername());
//        b.setTotalPayment();
        b.setCustomerId(user.getUserId());

        // create a booking with the above atteibutes
        return "dfghjkl";
    }
}

