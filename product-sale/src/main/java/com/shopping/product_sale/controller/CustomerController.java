package com.shopping.product_sale.controller;

import com.shopping.product_sale.model.dao.entity.Customer;
import com.shopping.product_sale.model.dto.request.CustomerRequest;
import com.shopping.product_sale.model.dto.response.CustomerResponse;
import com.shopping.product_sale.service.impl.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    private final CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;

    }
    @GetMapping("/all")
    public ResponseEntity<List<CustomerResponse>> getAllCustomers() {
        List<CustomerResponse> customers = customerService.getCustomers();
        return ResponseEntity.ok(customers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse>  get(@PathVariable int id) {
          CustomerResponse customerResponse=customerService.getCustomer(id);
          return ResponseEntity.ok(customerResponse);
    }
    @PostMapping
    public ResponseEntity<Void> create(@RequestBody CustomerRequest customerRequest) {
        customerService.add(customerRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        customerService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable int id, @RequestBody CustomerRequest customerRequest) {
        customerService.update(id, customerRequest);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}

