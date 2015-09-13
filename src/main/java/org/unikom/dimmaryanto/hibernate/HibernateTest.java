
package org.unikom.dimmaryanto.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.unikom.dimmaryanto.dto.UserDetails;

/**
 * Created by dimmaryanto on 9/12/15.
 */
public class HibernateTest {
    public static void main(String[] args) {


        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        for (int i = 0; i < 10; i++) {
            UserDetails aUserDetails = new UserDetails();
            aUserDetails.setUsername("User ke " + i);
            session.save(aUserDetails);
        }

        session.beginTransaction().commit();
        session.close();
        sessionFactory.close();


    }
}
