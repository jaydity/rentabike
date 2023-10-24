package com.dbmsproj.rentabike.Repository;

import com.dbmsproj.rentabike.Models.blocklist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class blocklistRepository {
    @Autowired
    private JdbcTemplate tmp;
    public void insertBlocklist(blocklist bl){
        String s="INSERT INTO blocklist(customer,reason,blockedOn,activeFrom) VALUES(?,?,?,?)";
        tmp.update(s,bl.getCustomer(),bl.getReason(),bl.getBlockedOn(),bl.getActiveFrom());
    }
    public void deleteBlocklist(Long customerId){
        String s="DELETE FROM blocklist WHERE customer=?";
        tmp.update(s,customerId);
    }
}
