package com.easyshop.products.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter @Setter @NoArgsConstructor
public class Product {

    @Id
    private String id;

    private String name;
    private String categoryName;
    private String description;
    private String brand;
    private Double price;
    private int quantity;


}
