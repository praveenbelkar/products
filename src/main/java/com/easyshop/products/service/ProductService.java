package com.easyshop.products.service;

import com.easyshop.products.domain.ProductDto;
import com.easyshop.products.entity.Product;

import java.util.List;

public interface ProductService {

    /**
     * Returns a list of all the products
     * @return {@link ProductDto} containing products list
     */
    public ProductDto getAllProducts();

    /**
     * Returns list of products for given category id
     * @param categoryName
     * @return {@link ProductDto} containing products list
     */
    public ProductDto getProductsByCategory(String categoryName);
}
