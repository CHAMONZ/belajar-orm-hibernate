package org.unikom.dimmaryanto.dto;

import javax.persistence.*;
import java.util.Date;

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

    @Temporal(TemporalType.DATE)
    private Date joinedDate;

    @Lob
    private String address;

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

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
