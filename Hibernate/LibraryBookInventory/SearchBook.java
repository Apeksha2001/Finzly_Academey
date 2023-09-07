package Hibernate.LibraryBookInventory;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class SearchBook {
    public static void main(String[] args) {
//        a. Search for books published within a certain range of years.
//        b. Search for books written by a specific author.
//        c. Search for books with a specific title or containing specific keywords in the title.
//        d. Search for books with a specific ISBN number.
//        e. Display all books currently available in the library

        Configuration cfg=new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Book.class);
        SessionFactory factory=cfg.buildSessionFactory();//connection factory
        Session session=factory.openSession(); //connection
        Transaction tr=session.beginTransaction();
        Criteria criteria= session.createCriteria(Book.class);

        // a. Search for books published within a certain range of years.
        criteria.add(Restrictions.between("publicationYear",1990,2020));
        List<Book>bookbyYear=criteria.list();
        System.out.println(bookbyYear);

        //b. Search for books written by a specific author.
        criteria.add(Restrictions.eq("author","apeksha"));
        List<Book>bookByauthor=criteria.list();
        System.out.println(bookByauthor);

        //c. Search for books with a specific title or containing specific keywords in the title.
        //1.If Book with specific title:
        criteria.add(Restrictions.eq("title","GoodThought"));
        List<Book>bookByTitle1=criteria.list();
        System.out.println(bookByTitle1);

        //Book containing specific keywords in the title.
        criteria.add(Restrictions.like("title","%ood%"));
        List<Book>BookByTitle2=criteria.list();
        System.out.println(BookByTitle2);


        //  d. Search for books with a specific ISBN number.
        criteria.add(Restrictions.eq("ISBN",1));
        List<Book>bookByISBN=criteria.list();
        System.out.println(bookByISBN);

        //e. Display all books currently available in the library
        List<Book> availableBooks = criteria.list();
        for (Book book : availableBooks) {
            System.out.println(book);
        }
















        session.close();



    }
}
