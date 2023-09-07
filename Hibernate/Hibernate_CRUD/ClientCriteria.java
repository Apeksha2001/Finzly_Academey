package Hibernate.Hibernate_CRUD;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ClientCriteria {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure();

        cfg.addAnnotatedClass(Employee.class);
        SessionFactory factory=cfg.buildSessionFactory();//connection factory
        Session session=factory.openSession(); //connection
        Criteria criteria=session.createCriteria(Employee.class);

        //Get all details from table
        List<Employee> allEmployee = criteria.list();
        //System.out.println(allEmployee);
        for (Employee employees:allEmployee) {
            System.out.println(employees);

        }

      session.close();

}
}
