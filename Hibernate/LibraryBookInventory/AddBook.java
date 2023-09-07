package Hibernate.LibraryBookInventory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddBook {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Book.class);

        SessionFactory factory=cfg.buildSessionFactory();//connection factory
        Session session=factory.openSession(); //connection
        Transaction transaction=session.beginTransaction();

        //Add a new book
        Book book=new Book(4,"ShamachiAai","Sane Guruji",1990);
        session.save(book);
        System.out.println("Success");

        transaction.commit();
        session.close();

    }
}
