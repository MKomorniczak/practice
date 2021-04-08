package com.example.practice.dto;

import com.sun.istack.internal.NotNull;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import java.time.LocalDate;
import java.util.UUID;

public class Customer {
    @NotNull
    private UUID customerId = UUID.randomUUID();

    @NotNull
    @Email (message= "Invalid email format")
    private String email;

    @NotNull
    private LocalDate regDate = LocalDate.now();

    private boolean active = true;

    @Valid
    private CustomerDetails details;

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public CustomerDetails getDetails() {
        return details;
    }

    public void setDetails(CustomerDetails details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", email='" + email + '\'' +
                ", regDate=" + regDate +
                ", active=" + active +
                ", details=" + details +
                '}';
    }
}


