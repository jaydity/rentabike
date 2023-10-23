package com.dbmsproj.rentabike.Models;

import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.Text;

import java.time.LocalDate;

@Getter
@Setter
public class blocklist {
    private Long customer;
    private Text reason;
    private LocalDate  blockedOn;
    private transient LocalDate activeFrom;

    public LocalDate getActiveFrom() {
        activeFrom=blockedOn.plusMonths(2);
        return activeFrom;
    }

    public blocklist(Long customer, Text reason, LocalDate blockedOn) {
        this.customer = customer;
        this.reason = reason;
        this.blockedOn = blockedOn;
    }

    public Long getCustomer() {
        return customer;
    }

    public Text getReason() {
        return reason;
    }

    public LocalDate getBlockedOn() {
        return blockedOn;
    }

    public void setCustomer(Long customer) {
        this.customer = customer;
    }

    public void setReason(Text reason) {
        this.reason = reason;
    }

    public void setBlockedOn(LocalDate blockedOn) {
        this.blockedOn = blockedOn;
    }

    public void setActiveFrom(LocalDate activeFrom) {
        this.activeFrom = activeFrom;
    }
}
