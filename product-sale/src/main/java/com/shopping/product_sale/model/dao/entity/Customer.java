package com.shopping.product_sale.model.dao.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table
@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String f_name;
    private String email;
    private String password;
}
