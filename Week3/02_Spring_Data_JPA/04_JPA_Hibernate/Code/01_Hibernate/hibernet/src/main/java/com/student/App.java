package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // Load configuration
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Student.class);

        // Create session factory
        SessionFactory factory = cfg.buildSessionFactory();

        // Open session
        Session session = factory.openSession();

        // Create transaction
        Transaction tx = session.beginTransaction();

        // Create student 1
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Venkata");

        // Create student 2
        Student s2 = new Student();
        s2.setId(2);
        s2.setName("Sai");

        // Create student 3
        Student s3 = new Student();
        s3.setId(3);
        s3.setName("Ram");

        // Save each object
        session.save(s1);
        session.save(s2);
        session.save(s3);

        // Commit transaction
        tx.commit();

        // Close session
        session.close();
        factory.close();

        System.out.println("Students saved!");
    }
}