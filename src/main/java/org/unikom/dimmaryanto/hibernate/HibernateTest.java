
package org.unikom.dimmaryanto.hibernate;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
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

        Criteria criteria = session.createCriteria(UserDetails.class);
        criteria.add(Restrictions.or(Restrictions.between("id", 20, 26), Restrictions.eq("id", 29)));

        List<UserDetails> listOfUserDetailses = criteria.list();


        Iterator<UserDetails> iterator = listOfUserDetailses.iterator();

        while (iterator.hasNext()) {
            UserDetails user = iterator.next();
            System.out.println("Username is " + user.getUsername() + " user id is " + user.getId());
        }

        session.beginTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}
