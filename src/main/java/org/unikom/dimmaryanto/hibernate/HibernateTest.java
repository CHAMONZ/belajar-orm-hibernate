
package org.unikom.dimmaryanto.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.unikom.dimmaryanto.dto.Address;
import org.unikom.dimmaryanto.dto.UserDetails;

import java.util.Date;

/**
 * Created by dimmaryanto on 9/12/15.
 */
public class HibernateTest {
    public static void main(String[] args) {
        UserDetails aUser = new UserDetails();

        aUser.setUsername("Riansyah Permana Putra");
        aUser.setAddress(new Address("Jl.Cikutra", "Indonesia", "Bandung", "40526"));
        aUser.setJoinedDate(new Date());

        UserDetails aUser2 = new UserDetails();

        aUser2.setUsername("Dimas Maryanto");
        aUser2.setAddress(new Address("Jl.Bukit Indah No B8", "Indonesia", "Bandung", "40524"));
        aUser2.setJoinedDate(new Date());

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(aUser);
        session.save(aUser2);
        session.beginTransaction().commit();
        session.close();

        sessionFactory.close();
    }
}
