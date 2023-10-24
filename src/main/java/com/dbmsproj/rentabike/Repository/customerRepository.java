package com.dbmsproj.rentabike.Repository;

import com.dbmsproj.rentabike.Models.customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class customerRepository {
    @Autowired
    private JdbcTemplate tmp;

    public void insertCustomer(customers c){

        String s="INSERT INTO customers(customerFirstName,customerMiddleName,customerLastName,customerAddress,phone,driversLicenseId,numberOfAccidents)";

        tmp.update(s,c.getCustomerFirstName(),c.getCustomerMiddleName(),c.getCustomerLastName(),c.getCustomerAddress(),c.getPhone(),c.getDriversLicenseId(),c.getNumberOfAccidents());

    }

    public void deleteCustomer(String licenseId){
        String s="DELETE FROM customers WHERE driversLicenseId-?";
        tmp.update(s,licenseId);
    }

}
