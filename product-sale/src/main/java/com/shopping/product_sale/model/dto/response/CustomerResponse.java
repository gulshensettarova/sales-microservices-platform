package com.shopping.product_sale.model.dto.response;

import lombok.Data;

@Data
public class CustomerResponse {
    private int id;
    private String name;
    private String surname;
    private String f_name;
    private String email;
    private String password;
}
