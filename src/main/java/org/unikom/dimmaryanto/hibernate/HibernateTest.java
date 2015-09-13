
package org.unikom.dimmaryanto.hibernate;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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

        //"from UserDetails" UserDetails -> bukan merupakan nama Table tetapi nama Object Class Entity
        Query query = session.createQuery("select username from UserDetails where id > :uid and username like :uname");
        query.setString("uname", "User ke 5");
        query.setInteger("uid", 6);

        query.setFirstResult(5);
        query.setMaxResults(4);

        List<String> users = query.list();

        session.beginTransaction().commit();
        session.close();


        Iterator<String> iterator = users.iterator();

        while (iterator.hasNext()) {
            //untuk mengambil object UserDetails
            String user = iterator.next();
            System.out.println("User ID : " + user);
        }
        sessionFactory.close();

    }
}
