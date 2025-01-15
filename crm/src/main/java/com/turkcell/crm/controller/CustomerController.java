package com.turkcell.crm.controller;

import com.turkcell.crm.entity.Customer;
import com.turkcell.crm.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    // DI --> Dependency Injection
    private CustomerService customerService;
    public CustomerController(CustomerService customerService)
    {
        this.customerService = customerService;
    }

    @GetMapping()
    public List<Customer> getAll(){
        return customerService.getAll();
    }

    @GetMapping("{id}")
    public Customer getById(@PathVariable int id){
        return customerService.getById(id);
    }

    @PostMapping()
    public Customer add(@RequestBody @Valid Customer customer) // requestBody : kullanıcıdan obje şeklinde veri almak
    {
        return customerService.add(customer);
    }




}
