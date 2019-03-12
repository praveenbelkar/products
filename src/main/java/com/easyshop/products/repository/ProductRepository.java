package com.easyshop.products.repository;

import com.easyshop.products.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {

    public List<Product> findByCategoryName(String categoryName);

}
