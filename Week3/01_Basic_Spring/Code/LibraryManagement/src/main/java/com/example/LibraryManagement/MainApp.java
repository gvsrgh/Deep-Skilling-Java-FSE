package com.example.LibraryManagement;

import org.springframework.context.ApplicationContext;
/**
 * Hello world!
 *
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = (BookService) context.getBean("bookService");
        bookService.addBook("Spring in Action");

        ((ClassPathXmlApplicationContext) context).close();
    }
}