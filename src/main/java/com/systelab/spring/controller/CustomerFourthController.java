package com.systelab.spring.controller;

import com.systelab.spring.model.Customer;
import com.systelab.spring.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders = "Authorization", allowCredentials = "true")
public class CustomerFourthController {

    private final CustomerService customerService;

    // As of Spring 4.3, classes with a single constructor can omit the @Autowired annotation. A nice little bit of convenience and boilerplate removal!
    public CustomerFourthController(CustomerService customerService) {
        this.customerService=customerService;
    }

    @GetMapping("/customers4")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        return ResponseEntity.ok(customerService.getCustomers());
    }
}