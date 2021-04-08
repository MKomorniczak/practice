package com.example.practice.dto;

import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Required;

import javax.validation.constraints.*;
import java.util.Optional;
import java.util.UUID;

public class CustomerDetails {

    private UUID detailsId = UUID.randomUUID();

    @NotEmpty(message = "can not be empty")
    @Size(min = 3, max = 30, message = "Street name has to be at least 3 letters long")
    private String street;

    @NotEmpty(message = "can not be empty")
    @Size(min = 5, max = 5, message = "Zip Code must be of length 5")
    private String zipCode;

    @NotEmpty(message = "can not be empty")
    @Size(min = 2, max = 30, message = "City name letters between 2-30")
    private String city;

    @NotEmpty(message = "can not be empty")
    private String homePhone;

    @NotEmpty(message = "can not be empty")
    @Size(min = 10, max = 10, message = "Cellphone must be of length 10")
    private String cellphone;


    public UUID getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(UUID detailsId) {
        this.detailsId = detailsId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }


    @Override
    public String toString() {
        return "CustomerDetails{" +
                "detailsId=" + detailsId +
                ", street=" + street +
                ", zipCode=" + zipCode +
                ", city=" + city +
                ", homePhone=" + homePhone +
                ", cellphone=" + cellphone +
                '}';
    }
}
