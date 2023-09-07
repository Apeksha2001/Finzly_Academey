package Hibernate.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeUpdate {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Employeee.class);

        SessionFactory factory=cfg.buildSessionFactory();//connection factory

        Session session=factory.openSession(); //connection

        Transaction transaction=session.beginTransaction();

        Employeee employeee=new Employeee(2,"Apeksha","Dhormale","28/07/2001","asdgb@gmail.com","Developer",5000);
        session.saveOrUpdate(employeee);   //here updated record store and the record which is nott present  gets inserted
        System.out.println("Updated Successfully");

        transaction.commit();

    }

}
