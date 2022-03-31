package org.example;

import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
      Books b = new Books();
     b.setBookid(2);
     b.setBookname("adirya");
     b.setBookauthor("abc");
     b.setBookprice(2000);
     BooksDao.insertBook(b);
     BooksDao.updateBook("adirya",3000);
     BooksDao.deleteBook("adirya");


    }
}
