package com.easyshop.products.controller;

import com.easyshop.products.domain.ProductDto;
import com.easyshop.products.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "/product", description = "API for products", tags = {"product"})
@RequestMapping("/product")
@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @ApiOperation(value = "Provides a list of products", tags={"Products"})
    @RequestMapping(value = "/", produces = "application/json")
    public String test(){
        return "test";
    }

    @GetMapping(value = "/all", produces = "application/json")
    public ProductDto getAllProducts() {
        return productService.getAllProducts();
    }
}
