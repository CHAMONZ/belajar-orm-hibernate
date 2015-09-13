
package org.unikom.dimmaryanto.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.unikom.dimmaryanto.dto.UserDetails;
import org.unikom.dimmaryanto.dto.Vehicle;

/**
 * Created by dimmaryanto on 9/12/15.
 */
public class HibernateTest {
    public static void main(String[] args) {
        UserDetails aUser = new UserDetails();
        aUser.setUsername("Riansyah Permana Putra");


        Vehicle aMotor = new Vehicle();
        aMotor.setVehicleName("Honda Beat");

        aUser.getVehicleId().add(aMotor);

        Vehicle aMotor2 = new Vehicle();
        aMotor2.setVehicleName("Honda CBR");
        aUser.getVehicleId().add(aMotor2);

        aMotor.getUserList().add(aUser);
        aMotor2.getUserList().add(aUser);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(aUser);
        session.save(aMotor);
        session.save(aMotor2);
        session.beginTransaction().commit();
        session.close();
        sessionFactory.close();


    }
}
