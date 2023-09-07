package Hibernate.Employee;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class EmployeeCriteria {
//    a. Get the employees who is having salary getter that 30000.
//    b. Get the employees who has department developer and tester
//    c. Get the employees from all the departments other than tester.
//    d. Sort (descending) the employees based of their salary.

    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure();

        cfg.addAnnotatedClass(Employeee.class);
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tr=session.beginTransaction();
        Criteria criteria=session.createCriteria(Employeee.class);

        //salary greater than 30000

        criteria.add(Restrictions.ge("salary",30000));
        List<Employeee>employeees1=criteria.list();
        System.out.println(employeees1);

        //get developer and tester list
        criteria.add(Restrictions.in("department", new String[]{"tester", "developer"}));
        List<Employeee> employeees2 = criteria.list();
        System.out.println(employeees2);

        // employees from all the departments other than tester
        criteria.add(Restrictions.ne("department", "tester"));
        List<Employeee> employeees3 = criteria.list();
        System.out.println(employeees3);

        //Desc salary
        criteria.addOrder(Order.desc("salary"));
        List<Employeee> employees = criteria.list();
        System.out.println(employees);

        session.close();




    }


}
