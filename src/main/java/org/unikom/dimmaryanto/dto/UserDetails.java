package org.unikom.dimmaryanto.dto;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.Type;

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

    @ElementCollection
    @JoinTable(name = "USER_ADDRESS",
            joinColumns = @JoinColumn(name = "USER_ID")
    )
    @SequenceGenerator(name = "seq-gen", sequenceName = "sequance_generator")
    @CollectionId(columns = {@Column(name = "ADDRESS_ID")}, type = @Type(type = "long"), generator = "seq-gen")
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
