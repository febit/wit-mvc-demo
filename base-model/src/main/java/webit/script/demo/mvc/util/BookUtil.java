// Copyright (c) 2013, Webit Team. All Rights Reserved.
package webit.script.demo.mvc.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import webit.script.demo.mvc.model.Book;

/**
 *
 * @author Zqq
 */
public class BookUtil {

    public static List<Book> findBooks() {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            List<Book> books = new ArrayList<Book>(10);
            books.add(new Book(1, "Practical API Design", "Jaroslav Tulach", format.parse("2008-07-29"), 75));
            books.add(new Book(2, "Effective Java", "Joshua Bloch", format.parse("2008-05-28"), 55));
            books.add(new Book(3, "Java Concurrency in Practice", "Doug Lea", format.parse("2006-05-19"), 60));
            books.add(new Book(4, "Java Programming Language", "James Gosling", format.parse("2005-08-27"), 65));
            books.add(new Book(5, "Domain-Driven Design", "Eric Evans", format.parse("2003-08-30"), 70));
            books.add(new Book(6, "Agile Project Management with Scrum", "Ken Schwaber", format.parse("2004-03-10"), 40));
            books.add(new Book(7, "J2EE Development without EJB", "Rod Johnson", format.parse("2011-09-17"), 40));
            books.add(new Book(8, "Design Patterns", "Erich Gamma", format.parse("1994-11-10"), 60));
            books.add(new Book(9, "Agile Software Development, Principles, Patterns, and Practices", " Robert C. Martin", format.parse("2002-10-25"), 80));
            books.add(new Book(10, "Design by Contract, by Example", "Richard Mitchell", format.parse("2001-10-22"), 50));
            return books;
        } catch (ParseException ex) {
            return null;
        }
    }
}
