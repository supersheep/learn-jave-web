package com.springapp.mvc;

import com.springapp.mvc.entities.Customer;
import com.springapp.mvc.service.CustomerService;
import com.springapp.mvc.service.impl.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        CustomerService customerService = new CustomerServiceImpl();
        List<Customer> customers = customerService.findAll();

        System.out.println(customers);
        model.addAttribute("customers", customers);
        model.addAttribute("message", "Hello world!");
        return "hello";
    }
}