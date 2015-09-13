package org.unikom.dimmaryanto.dto;

import javax.persistence.*;

/**
 * Created by dimmaryanto on 9/12/15.
 */
@Entity
@Table(name = "users")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

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
