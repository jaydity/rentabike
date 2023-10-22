package com.dbmsproj.rentabike.Models;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

}
