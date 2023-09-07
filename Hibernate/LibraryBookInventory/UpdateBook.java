package Hibernate.LibraryBookInventory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateBook {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Book.class);

        SessionFactory factory=cfg.buildSessionFactory();//connection factory

        Session session=factory.openSession(); //connection

        Transaction transaction=session.beginTransaction();

        Book book=new Book(6,"JavaByKiran","Kiran",2017);
        session.saveOrUpdate(book);   //here updated record store and the record which is nott present  gets inserted
        System.out.println("Updated Successfully");

        transaction.commit();
        session.close();
    }
}
