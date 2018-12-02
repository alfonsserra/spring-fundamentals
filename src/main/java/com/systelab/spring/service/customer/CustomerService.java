package com.systelab.spring.service.customer;

import com.systelab.spring.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    public List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John", "Maeda"));
        customers.add(new Customer("Connan", "O'Brian"));
        customers.add(new Customer("Laura", "Ashley"));
        return customers;
    }
}
