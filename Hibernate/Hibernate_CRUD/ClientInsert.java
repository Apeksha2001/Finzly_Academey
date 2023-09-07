package Hibernate.Hibernate_CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientInsert {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Employee.class);

        SessionFactory factory=cfg.buildSessionFactory();//connection factory

        Session session=factory.openSession(); //connection

        Transaction transaction=session.beginTransaction();

        Employee employee=new Employee(3,"Ram","10000");

        session.save(employee);
        transaction.commit();
        session.close();

    }
}
