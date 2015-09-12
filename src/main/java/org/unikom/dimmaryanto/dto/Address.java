package org.unikom.dimmaryanto.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by dimmaryanto on 9/12/15.
 */
@Embeddable
public class Address {

    @Column(name = "STREET_ADDRES")
    private String street;

    @Column(name = "STATE")
    private String state;

    @Column(name = "CITY_NAME")
    private String city;

    @Column(name = "PIN_CODE")
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
