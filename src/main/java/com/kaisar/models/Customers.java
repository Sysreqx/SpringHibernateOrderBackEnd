package com.kaisar.models;

import jdk.jfr.Name;
import org.springframework.stereotype.Controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {
    @Id
    private int customerId;
    private String customerName;
    private String customerAddress;
    private String customerContact;

    public Customers(int customerId,
                     String customerName,
                     String customerAddress,
                     String customerContact) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerContact = customerContact;
    }

    public Customers() {

    }

    public Customers(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact;
    }
}
