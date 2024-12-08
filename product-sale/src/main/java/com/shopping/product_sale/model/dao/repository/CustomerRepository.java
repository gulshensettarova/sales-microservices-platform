package com.shopping.product_sale.model.dao.repository;

import com.shopping.product_sale.model.dao.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
