package com.dbmsproj.rentabike.service;

import com.dbmsproj.rentabike.Repository.UserRepository;
import com.dbmsproj.rentabike.Repository.bikesRepository;
import com.dbmsproj.rentabike.Repository.bikePurchasesRepository;
import com.dbmsproj.rentabike.Repository.blocklistRepository;
import com.dbmsproj.rentabike.Repository.bookingsRepository;
import com.dbmsproj.rentabike.Repository.customerRepository;
import com.dbmsproj.rentabike.Repository.retailersRepository;
import com.dbmsproj.rentabike.Repository.accidentsRepository;
import com.dbmsproj.rentabike.Models.bikes;
import com.dbmsproj.rentabike.Models.bikePurchases;
import com.dbmsproj.rentabike.Models.User;
import com.dbmsproj.rentabike.Models.customers;
import com.dbmsproj.rentabike.Models.retailers;
import com.dbmsproj.rentabike.Models.blocklist;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class adminService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private bookingsRepository bookingsRepository;

    @Autowired
    private bikesRepository bikesRepository;

    @Autowired
    private bikePurchasesRepository bikePurchasesRepository;

    @Autowired
    private blocklistRepository blocklistRepository;

    @Autowired
    private customerRepository customerRepository;

    @Autowired
    private retailersRepository retailersRepository;

    public void addbike(bikes bike, bikePurchases newBike){
        bikesRepository.insertBike(bike);
        bikePurchasesRepository.insertBikePurchase(newBike);

    }
    public void deleteBike(String registrationNumber) {
        bikesRepository.deleteBike(registrationNumber);
    }

    public void updateBikeAvailability(String registrationNumber, String isAvailable) {
        bikesRepository.updateBike(registrationNumber, isAvailable);
    }

    public void addRetailer(retailers retailer) {
        retailersRepository.insertRetailer(retailer);
    }

    public void deleteRetailer(int retailerId) {
        retailersRepository.deleteRetailer(retailerId);
    }


}
