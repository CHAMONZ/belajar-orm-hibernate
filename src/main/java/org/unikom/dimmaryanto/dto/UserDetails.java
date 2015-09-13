package org.unikom.dimmaryanto.dto;

import javax.persistence.*;

/**
 * Created by dimmaryanto on 9/12/15.
 */
@Entity
@Table(name = "users")
@NamedQuery(name = "users.findById", query = "from UserDetails where id = :uid")
@NamedNativeQuery(name = "users.findByName", query = "select * from users where username = :uname", resultClass = UserDetails.class)
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
