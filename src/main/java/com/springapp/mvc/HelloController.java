package com.springapp.mvc;

import com.springapp.mvc.entities.Customer;
import com.springapp.mvc.service.CustomerService;
import com.springapp.mvc.service.impl.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {
    CustomerService customerService = new CustomerServiceImpl();

    protected String showList(Model model){
        List<Customer> customers = customerService.findAll();

        System.out.println(customers);
        model.addAttribute("customers", customers);
        model.addAttribute("message", "Hello world!");
        return "hello";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(Model model) {
        return showList(model);
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addCustomer(@RequestParam String firstName, @RequestParam String lastName, Model model) {
        customerService.save(new Customer(firstName, lastName));
        return showList(model);
    }
}