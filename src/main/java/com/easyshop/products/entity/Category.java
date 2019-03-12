package com.easyshop.products.entity;

import org.springframework.data.annotation.Id;

public class Category {

    @Id
    private String id;

    private String name;
    private String description;

}
