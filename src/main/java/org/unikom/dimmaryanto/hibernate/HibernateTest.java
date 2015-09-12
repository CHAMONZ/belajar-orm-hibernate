
package org.unikom.dimmaryanto.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.unikom.dimmaryanto.dto.UserDetails;

import java.util.Date;

/**
 * Created by dimmaryanto on 9/12/15.
 */
public class HibernateTest {
    public static void main(String[] args) {
        UserDetails aUser = new UserDetails();

        aUser.setId(3);
        aUser.setUsername("Riansyah Permana Putra");
        aUser.setAddress("Jl.Cikutra");
        aUser.setJoinedDate(new Date());

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(aUser);
        session.beginTransaction().commit();
        session.close();

        aUser = null;

        session = sessionFactory.openSession();

        session.beginTransaction();
        aUser = session.get(UserDetails.class, 3);

        System.out.println(aUser.getUsername() + " is a user recieved from table USER_DETAILS");

        sessionFactory.close();
    }
}
