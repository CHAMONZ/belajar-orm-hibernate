package org.unikom.dimmaryanto.dto;

import javax.persistence.Entity;

/**
 * Created by dimmaryanto on 9/13/15.
 */
@Entity
public class TwoWheels extends Vehicle {

    private String StiringHandle;

    public String getStiringHandle() {
        return StiringHandle;
    }

    public void setStiringHandle(String stiringHandle) {
        StiringHandle = stiringHandle;
    }
}
