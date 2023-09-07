package Hibernate.Hibernate_CRUD;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ClientSelect {
        public static void main(String[] args) {

            Configuration cfg=new Configuration();
            cfg.configure();
            cfg.addAnnotatedClass(Employee.class);

            SessionFactory factory=cfg.buildSessionFactory();//connection factory

            Session session=factory.openSession(); //connection

           Employee employee=session.load(Employee.class,5); //display data
            System.out.println(employee);

            session.close();


    }
}
