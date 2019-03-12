package com.easyshop.products.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter @Setter @NoArgsConstructor
public class Product {

    private String id;
    private String name;
    private String categoryId;
    private String description;
    private Double price;
    private int quantity;

}
