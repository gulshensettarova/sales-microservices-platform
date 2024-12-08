package com.shopping.product_sale.service.impl;

import com.shopping.product_sale.mapper.CustomerMapper;
import com.shopping.product_sale.model.dao.entity.Customer;
import com.shopping.product_sale.model.dao.repository.CustomerRepository;
import com.shopping.product_sale.model.dto.request.CustomerRequest;
import com.shopping.product_sale.model.dto.response.CustomerResponse;
import com.shopping.product_sale.service.inter.CustomerInterface;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService implements CustomerInterface {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerService(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Transactional
    @Override
    public void add(CustomerRequest request) {
        Customer customer = customerMapper.toEntity(request);
        customerRepository.save(customer);

    }

    @Transactional
    @Override
    public void update(int id, CustomerRequest request) {
        customerRepository.findById(id)
                .ifPresent(oldCustomer -> {
                    oldCustomer = customerMapper.toEntity(request);
                    customerRepository.save(oldCustomer);
                });
    }

    @Transactional
    @Override
    public void delete(int id) {
        Customer existingCustomer = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        customerRepository.delete(existingCustomer);

    }

    @Override
    public CustomerResponse getCustomer(int id) {
        Customer customer= customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        return customerMapper.toDto(customer);
    }

    @Override
    public List<CustomerResponse> getCustomers() {
        List<Customer> customers = customerRepository.findAll();
        return customerMapper.toDto(customers);
    }

}
