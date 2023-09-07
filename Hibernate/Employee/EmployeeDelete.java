package Hibernate.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDelete {
    public static void main(String[] args) {


        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Employeee.class);

        SessionFactory factory = cfg.buildSessionFactory();//connection factory

        Session session = factory.openSession(); //connection

        Transaction transaction = session.beginTransaction();

        Employeee employeee = session.load(Employeee.class, 3);
//        System.out.println(employee);

        session.delete(employeee);
        System.out.println("Deleted Successfully");

        transaction.commit();
//        System.out.println(employee);  //error No row with the given identifier exists: [com.Hibernate.Employee#3]
        session.close();
    }
}