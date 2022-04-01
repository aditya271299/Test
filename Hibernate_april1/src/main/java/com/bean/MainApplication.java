package com.bean;

import antlr.DocBookCodeGenerator;
import com.bean.dao.BookDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("adi");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        BookDao bookDao = new BookDao();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        do{
        System.out.println("1:update salary by batch\n2:1:update salary by batch\nEnter your choice::");
        int ch = Integer.parseInt(bufferedReader.readLine());
        switch (ch) {

            case 1:
                bookDao.updateSalary(20000);
                break;
            case 2:
                bookDao.batchDelete(40000);
                break;



        }

        }while (true);
    }
}
