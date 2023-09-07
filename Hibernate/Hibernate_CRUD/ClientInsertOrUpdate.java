package Hibernate.Hibernate_CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientInsertOrUpdate {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Employee.class);

        SessionFactory factory=cfg.buildSessionFactory();//connection factory

        Session session=factory.openSession(); //connection

        Transaction transaction=session.beginTransaction();

        Employee employee=new Employee(5,"apeksha","5000");
        session.saveOrUpdate(employee);   //here updated record store and the record which is nott present  gets inserted

        transaction.commit();

    }
}
