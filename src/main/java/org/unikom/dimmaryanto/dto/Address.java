package org.unikom.dimmaryanto.dto;

import javax.persistence.Embeddable;

/**
 * Created by dimmaryanto on 9/12/15.
 */
@Embeddable
public class Address {

    private String street;
    private String state;
    private String city;
    private String pincode;

    public Address() {
    }

    public Address(String street, String state, String city, String pincode) {
        this.street = street;
        this.state = state;
        this.city = city;
        this.pincode = pincode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
