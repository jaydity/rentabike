package com.dbmsproj.rentabike.Models;

import org.w3c.dom.Text;

import java.time.LocalDate;

public class blocklist {
    private Long customer;
    private Text reason;
    private LocalDate  blockedOn;
    private transient LocalDate activeFrom;

    public LocalDate getActiveFrom() {
        activeFrom=blockedOn.plusMonths(2);
        return activeFrom;
    }
}
