package Hibernate.Hibernate_CRUD;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;


public class ClientCriteriaProjection {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure();

        cfg.addAnnotatedClass(Employee.class);
        SessionFactory factory=cfg.buildSessionFactory();//connection factory
        Session session=factory.openSession(); //connection
        Criteria criteria=session.createCriteria(Employee.class);


        //Get all employee name
        criteria.setProjection(Projections.property("employeeName"));





}
}
