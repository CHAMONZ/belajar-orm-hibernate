
package org.unikom.dimmaryanto.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.unikom.dimmaryanto.dto.Address;
import org.unikom.dimmaryanto.dto.UserDetails;

/**
 * Created by dimmaryanto on 9/12/15.
 */
public class HibernateTest {
    public static void main(String[] args) {
        UserDetails aUser = new UserDetails();

        aUser.setUsername("Riansyah Permana Putra");

        Address address = new Address();
        address.setStreet("Jl.bukit indah no b8");
        address.setState("Indonesia");
        address.setCity("bandung");
        address.setPincode("40524");

        Address address1 = new Address();
        address1.setStreet("JL.Cikutra");
        address1.setState("Indonesia");
        address1.setCity("bandung");
        address1.setPincode("40526");

        aUser.getListofAddress().add(address);
        aUser.getListofAddress().add(address1);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(aUser);
        session.beginTransaction().commit();
        session.close();


    }
}
