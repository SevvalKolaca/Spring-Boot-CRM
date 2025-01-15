package com.turkcell.crm.service;

import java.util.*;
import com.turkcell.crm.entity.Customer;
import org.springframework.stereotype.Service;

public interface CustomerService {

    Customer add(Customer customer);

    List<Customer> getAll();

    Customer getById(int id);
}
