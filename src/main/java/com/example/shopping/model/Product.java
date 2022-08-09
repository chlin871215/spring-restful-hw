package com.example.shopping.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Product {
    private String name;
    private int price;
    public int stock;
    private String description;
}
