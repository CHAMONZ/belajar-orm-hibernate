
package org.unikom.dimmaryanto.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.unikom.dimmaryanto.dto.FourWheels;
import org.unikom.dimmaryanto.dto.TwoWheels;
import org.unikom.dimmaryanto.dto.UserDetails;
import org.unikom.dimmaryanto.dto.Vehicle;

/**
 * Created by dimmaryanto on 9/12/15.
 */
public class HibernateTest {
    public static void main(String[] args) {
        UserDetails aUser = new UserDetails();
        aUser.setUsername("Riansyah Permana Putra");


        Vehicle aVehicle = new Vehicle();
        aVehicle.setVehicleName("Kendaraan");

        TwoWheels aMotoCicyle = new TwoWheels();
        aMotoCicyle.setVehicleName("CBR 150R");
        aMotoCicyle.setStiringHandle("2 roda");

        FourWheels aCar = new FourWheels();
        aCar.setVehicleName("Honda Jazz");
        aCar.setStiringWheels("4 roda");


        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(aVehicle);
        session.save(aCar);
        session.save(aMotoCicyle);

        session.beginTransaction().commit();
        session.close();
        sessionFactory.close();


    }
}
