package org.unikom.dimmaryanto.dto;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by dimmaryanto on 9/12/15.
 */
@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String username;

    @ElementCollection
    private Set<Address> listofAddress = new HashSet();

    public Set<Address> getListofAddress() {
        return listofAddress;
    }

    public void setListofAddress(Set<Address> listofAddress) {
        this.listofAddress = listofAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



}
