package org.unikom.dimmaryanto.dto;

import javax.persistence.*;

/**
 * Created by dimmaryanto on 9/13/15.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleId;
    private String vehicleName;

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
