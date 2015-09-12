package org.unikom.dimmaryanto.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by dimmaryanto on 9/12/15.
 */
@Entity(name = "USER_DETAILS")
public class UserDetails {

    @Id
    @Column(name = "user_Id")
    private int id;

    @Column(name = "user_name")
    private String username;

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
