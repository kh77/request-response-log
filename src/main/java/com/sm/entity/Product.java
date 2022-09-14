package com.sm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {


    private Long id;
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
