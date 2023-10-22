package spring_boot_proj.proj_spring.models;

public class customers {
    private Long customerId;
    private String customerName;
    private String CustomerAddress;
    private String phone;
    private enum IdentityProof{
        Aadhar_card,
        Voter_card,
        Passport
    }
    private String IdNumber;
    private String driversLicenseId;
    private int numberOfAccidents;

}
