package com.springapp.mvc.service;

import com.springapp.mvc.entities.Customer;

import java.util.List;

/**
 * Created by spud on 14-10-5.
 */
public interface CustomerService {
    List<Customer> findAll();
}
