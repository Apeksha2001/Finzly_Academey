package Hibernate.Hibernate_CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDelete {
    public static void main(String[] args) {


    Configuration cfg=new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Employee.class);

    SessionFactory factory=cfg.buildSessionFactory();//connection factory

    Session session=factory.openSession(); //connection

    Transaction transaction=session.beginTransaction();

    Employee employee=session.load(Employee.class,3);
//        System.out.println(employee);

        session.delete(employee);

        transaction.commit();
//        System.out.println(employee);  //error No row with the given identifier exists: [com.Hibernate.Employee#3]
        session.close();


    }
}