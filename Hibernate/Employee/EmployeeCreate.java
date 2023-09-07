package Hibernate.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeCreate {
    public static void main(String[] args) {
        try {
            Configuration cfg = new Configuration();
            cfg.configure();
            cfg.addAnnotatedClass(Employeee.class);

            SessionFactory factory = cfg.buildSessionFactory();
            Session session = factory.openSession();
            Transaction transaction = session.beginTransaction();

            Employeee employeee = new Employeee(5, "Raam", "Varma", "28/07/2001", "ram@gmail.com", "tester", 30000);

            session.save(employeee);
            System.out.println("Employee saved successfully");
            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
