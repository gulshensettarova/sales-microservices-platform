package com.shopping.product_sale.model.dto.request;

import lombok.Data;

@Data
public class CustomerRequest {
    private long id;
    private String name;
    private String surname;
    private String f_name;
    private String email;
    private String password;
}
