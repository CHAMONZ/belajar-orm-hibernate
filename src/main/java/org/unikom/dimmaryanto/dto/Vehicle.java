package org.unikom.dimmaryanto.dto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by dimmaryanto on 9/13/15.
 */
@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleId;
    private String vehicleName;

    @ManyToMany
    private Collection<UserDetails> userList = new ArrayList<UserDetails>();

    public Collection<UserDetails> getUserList() {
        return userList;
    }

    public void setUserList(Collection<UserDetails> userList) {
        this.userList = userList;
    }

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
