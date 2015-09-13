package org.unikom.dimmaryanto.dto;

import javax.persistence.Entity;

/**
 * Created by dimmaryanto on 9/13/15.
 */
@Entity
public class FourWheels extends Vehicle {

    private String stiringWheels;

    public String getStiringWheels() {
        return stiringWheels;
    }

    public void setStiringWheels(String stiringWheels) {
        this.stiringWheels = stiringWheels;
    }
}
