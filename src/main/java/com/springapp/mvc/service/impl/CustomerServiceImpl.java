package com.springapp.mvc.service.impl;

import com.springapp.mvc.dao.CustomerDao;
import com.springapp.mvc.dao.impl.CustomerDaoImpl;
import com.springapp.mvc.entities.Customer;
import com.springapp.mvc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by spud on 14-10-5.
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao = new CustomerDaoImpl();

    public List<Customer> findAll(){
        return customerDao.findAll();
    }

    public Customer save(Customer customer){
        return customerDao.save(customer);
    }

}
