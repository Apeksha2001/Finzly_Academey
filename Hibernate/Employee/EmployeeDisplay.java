package Hibernate.Employee;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeDisplay {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Employeee.class);
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();

        Employeee employeee=session.load(Employeee.class,2);
        System.out.println(employeee);
        session.close();
    }
}
