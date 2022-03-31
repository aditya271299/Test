package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class BooksDao {
    static Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
    SessionFactory sessionFactory = configuration.buildSessionFactory();

    public static void insertBook(Books b) {
        Session session = configuration.buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        int i = (int) session.save(b);
        transaction.commit();
        System.out.println("Record added successfully");

    }

    public static void  updateBook(String bn, float p) {
        Session session = configuration.buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query q = session.createQuery("update Book SET price=: x where bname=:y ");
        q.setParameter("x", p);
        q.setParameter("y", bn);
        int i = q.executeUpdate();
        transaction.commit();

    }

    public static  void  deleteBook(String bn) {
        Session session = configuration.buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query q = session.createQuery("delete from Book where bname=:y");
        q.setParameter("y", bn);
        int i = q.executeUpdate();
        transaction.commit();

    }

}
