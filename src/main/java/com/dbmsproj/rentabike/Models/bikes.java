package com.dbmsproj.rentabike.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class bikes {
    private String registrationNumber;
    private String bikeModel;
    //    private String owner;
    private enum bikeStatus{
        ok, good, excellent
    }
    private String CBookNumber;
    private String Insurance;
    private boolean isAvailable;

    public bikes(String registrationNumber, String bikeModel, String CBookNumber, String insurance, boolean isAvailable) {
        this.registrationNumber = registrationNumber;
        this.bikeModel = bikeModel;
        this.CBookNumber = CBookNumber;
        this.Insurance = insurance;
        this.isAvailable = isAvailable;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getBikeModel() {
        return bikeModel;
    }

    public String getCBookNumber() {
        return CBookNumber;
    }

    public String getInsurance() {
        return Insurance;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setBikeModel(String bikeModel) {
        this.bikeModel = bikeModel;
    }

    public void setCBookNumber(String CBookNumber) {
        this.CBookNumber = CBookNumber;
    }

    public void setInsurance(String insurance) {
        this.Insurance = insurance;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
}
