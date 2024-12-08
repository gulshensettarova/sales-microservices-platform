package com.shopping.product_sale.service.inter;

import com.shopping.product_sale.model.dao.entity.Customer;
import com.shopping.product_sale.model.dto.request.CustomerRequest;
import com.shopping.product_sale.model.dto.response.CustomerResponse;

import java.util.List;

public interface CustomerInterface {
    public void add(CustomerRequest request);
    public void update(int id,CustomerRequest request);
    public void delete(int customer);
    public CustomerResponse getCustomer(int id);
    public List<CustomerResponse> getCustomers();
}
