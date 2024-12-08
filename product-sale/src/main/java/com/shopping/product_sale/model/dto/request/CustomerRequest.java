package com.shopping.product_sale.model.dto.request;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NonNull;

@Data
public class CustomerRequest {
    private int id;
    @NotNull(message="Name is mandatory")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;
    private String surname;
    private String f_name;
    @Email(message = "Email should be valid")
    private String email;
    private String password;
}
