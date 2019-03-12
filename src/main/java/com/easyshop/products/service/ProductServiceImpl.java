package com.easyshop.products.service;

import com.easyshop.products.domain.ProductDto;
import com.easyshop.products.domain.ProductException;
import com.easyshop.products.entity.Product;
import com.easyshop.products.repository.ProductRepository;
import org.apache.commons.lang3.StringUtils;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;
    private ModelMapper modelMapper = new ModelMapper();
    private static Type TARGET_PRODUCT_TYPE = new TypeToken<List<com.easyshop.products.domain.Product>>(){}.getType();

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductDto getAllProducts() {
        List<Product> productEntities = productRepository.findAll();
        return createProductDto(productEntities);
    }

    private ProductDto createProductDto(List<Product> productEntities) {
        ProductDto productDto = new ProductDto();
        List<com.easyshop.products.domain.Product> products = new ArrayList<>();
        if(!CollectionUtils.isEmpty(productEntities)) {
            products =  modelMapper.map(productEntities, TARGET_PRODUCT_TYPE);
        }
        productDto.setProducts(products);
        return productDto;
    }

    @Override
    public ProductDto getProductsByCategory(String categoryName) {
        if(validCategoryName(categoryName)) {
            List<Product> productEntities =  productRepository.findByCategoryName(categoryName);
            return createProductDto(productEntities);
        }
        throw new ProductException("Invalid category id");
    }

    private boolean validCategoryName(String categoryName) {
        if(StringUtils.isNotBlank(categoryName)) {
            return true;
        }
        return false;
    }

}
