
package org.unikom.dimmaryanto.hibernate;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.unikom.dimmaryanto.dto.UserDetails;

import java.util.Iterator;
import java.util.List;

/**
 * Created by dimmaryanto on 9/12/15.
 */
public class HibernateTest {
    public static void main(String[] args) {


        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Query query = session.getNamedQuery("users.findByName");
        query.setString("uname", "User 9");

        List<UserDetails> users = query.list();

        Iterator<UserDetails> iterator = users.iterator();

        while (iterator.hasNext()) {
            //untuk mengambil object UserDetails
            UserDetails user = iterator.next();
            System.out.println("User Name is " + user.getUsername() + " with id is " + user.getId());
        }

        session.beginTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}
