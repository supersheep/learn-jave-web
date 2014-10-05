package com.springapp.mvc.service.impl;

import com.springapp.mvc.dao.CustomerDao;
import com.springapp.mvc.dao.impl.CustomerDaoImpl;
import com.springapp.mvc.entities.Customer;
import com.springapp.mvc.service.CustomerService;

import java.util.List;

/**
 * Created by spud on 14-10-5.
 */
public class CustomerServiceImpl implements CustomerService {


    public List<Customer> findAll(){
        return new CustomerDaoImpl().findAll();
    }

}
