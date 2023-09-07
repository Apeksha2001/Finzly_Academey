package Hibernate.LibraryBookInventory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteBook {
    public static void main(String[] args) {


        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Book.class);

        SessionFactory factory = cfg.buildSessionFactory();//connection factory
        Session session = factory.openSession(); //connection
        Transaction transaction = session.beginTransaction();
        Book book = session.load(Book.class, 6);

        session.delete(book);
        System.out.println("Deleted Successfully");

        transaction.commit();
        session.close();
    }
}
