package com.springapp.mvc.dao.impl;

import com.springapp.mvc.dao.CustomerDao;
import com.springapp.mvc.entities.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by spud on 14-10-5.
 */
public class CustomerDaoImpl implements CustomerDao{

    public List<Customer> findAll(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pudding");
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT c FROM Customer c");
        return query.getResultList();
    }
}
