package com.dbmsproj.rentabike.Models;


import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class customers {

    @Id
    private Long customerId;
    private String customerFirstName;
    private String customerMiddleName;
    private String customerLastName;
    private String CustomerAddress;
    private String phone;
    private enum IdentityProof{
        aadharCard,
        voterCard,
        passport
    }
    private String IdNumber;
    private String driversLicenseId;
    private int numberOfAccidents;

    public customers(   String customerFirstName, String customerMiddleName,
                        String customerLastName, String customerAddress, String phone, String idNumber,
                        String driversLicenseId, int numberOfAccidents
                    ) {
        this.customerFirstName = customerFirstName;
        this.customerMiddleName = customerMiddleName;
        this.customerLastName = customerLastName;
        this.CustomerAddress = customerAddress;
        this.phone = phone;
        this.IdNumber = idNumber;
        this.driversLicenseId = driversLicenseId;
        this.numberOfAccidents = numberOfAccidents;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public void setCustomerMiddleName(String customerMiddleName) {
        this.customerMiddleName = customerMiddleName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.CustomerAddress = customerAddress;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setIdNumber(String idNumber) {
        this.IdNumber = idNumber;
    }

    public void setDriversLicenseId(String driversLicenseId) {
        this.driversLicenseId = driversLicenseId;
    }

    public void setNumberOfAccidents(int numberOfAccidents) {
        this.numberOfAccidents = numberOfAccidents;
    }
}