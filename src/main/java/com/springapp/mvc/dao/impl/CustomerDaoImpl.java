package com.springapp.mvc.dao.impl;

import com.springapp.mvc.dao.CustomerDao;
import com.springapp.mvc.entities.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by spud on 14-10-5.
 */
@Repository("CustomerDao")
public class CustomerDaoImpl implements CustomerDao {


    public List<Customer> findAll() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pudding");
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT c FROM Customer c");
        List<Customer> customers = query.getResultList();
        return customers;
    }

    @Transactional
    public Customer save(Customer customer) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pudding");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(customer);
        em.getTransaction().commit();
        return customer;
    }
}
