package com.shopping.product_sale.mapper;

import com.shopping.product_sale.model.dao.entity.Customer;
import com.shopping.product_sale.model.dto.request.CustomerRequest;
import com.shopping.product_sale.model.dto.response.CustomerResponse;
import jakarta.persistence.MapKeyClass;
import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Mapper(componentModel="spring")
public interface CustomerMapper {
    public Customer toEntity(CustomerRequest customer);
    public List<Customer> toEntity(List<CustomerRequest> customers);
    List<CustomerResponse> toDto(List<Customer> customers);
    CustomerResponse toDto(Customer customers);
}
