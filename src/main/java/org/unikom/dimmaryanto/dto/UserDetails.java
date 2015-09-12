package org.unikom.dimmaryanto.dto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

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

    @ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name = "USER_ADDRESS",
            joinColumns = @JoinColumn(name = "USER_ID")
    )
    private Collection<Address> listofAddress = new ArrayList<Address>();

    public Collection<Address> getListofAddress() {
        return listofAddress;
    }

    public void setListofAddress(Collection<Address> listofAddress) {
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
