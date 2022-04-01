package com.bean.dao;

import com.bean.Teacher;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Arrays;
import java.util.List;

public class BookDao {
    static EntityManagerFactory factory = Persistence.createEntityManagerFactory("adi");
    static EntityManager manager = factory.createEntityManager();
    static CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();


    public  static void updateSalary(int salary){
    Query query = (Query) manager.createQuery("Select e from Teacher e where e.salary > 15000");
    List<Teacher> list = query.getResultList();
        for (Teacher t : list) {
        manager.getTransaction().begin();
        t.setSalary(t.getSalary() +salary );
        manager.getTransaction().commit();
        System.out.println(t);
    }
    }
    public static void batchDelete(int salary) {
        manager.getTransaction().begin();
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaDelete<Teacher> delete = builder.createCriteriaDelete(Teacher.class);

        Root e = delete.from(Teacher.class);
        delete.where(builder.greaterThan(e.get("salary"), salary));
        manager.createQuery(delete).executeUpdate();
        manager.getTransaction().commit();
        System.out.println("Deleted----------.");
    }


}
