package Hibernate.Hibernate_CRUD;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class ClientCriteriaRestriction {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure();

        cfg.addAnnotatedClass(Employee.class);
        SessionFactory factory=cfg.buildSessionFactory();//connection factory
        Session session=factory.openSession(); //connection
        Transaction tr=session.beginTransaction();
        Criteria criteria=session.createCriteria(Employee.class);

        //Get employee details with name apeksha

        criteria.add(Restrictions.eq("employeeName","Apeksha"));
        List<Employee> employee1= criteria.list();
        System.out.println(employee1);

//        //Get employee details excluding name apeksha

        criteria.add(Restrictions.ne("employeeName","Apeksha"));
        List<Employee> employee2= criteria.list();
        System.out.println(employee2);


// Get all employee those are having salary more than 10K

        criteria.add(Restrictions.lt("Salary","10000000"));
        List<Employee>employee3= criteria.list();
        System.out.println(employee3);

        // Get all employee those are having salary less than 10K

        criteria.add(Restrictions.gt("Salary","100000000000000000000000000"));
        List<Employee>employee4= criteria.list();
        System.out.println(employee4);




    }
}
