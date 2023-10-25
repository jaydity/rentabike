package com.dbmsproj.rentabike.Repository;

import com.dbmsproj.rentabike.Models.employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class employeesRepository {
    @Autowired
    private JdbcTemplate tmp;

    public void insertEmployee(employees e){
        String x="INSERT INTO employees(employeeName,phoneNumber,email,address) VALUES (?,?,?,?)";
        tmp.update(x,e.getEmployeeName(),e.getPhoneNumber(),e.getEmail(),e.getAddress());
    }
    public void deleteEmployee(String e){
        String x="DELETE FROM employees WHERE email=?";
        tmp.update(x,e);
    }
}
