package com.example.cartonlinestore.controller;

import com.example.cartonlinestore.model.Product;
import com.example.cartonlinestore.record.ProductRequest;
import com.example.cartonlinestore.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/store/order/add")
    public Collection<Product> getAllProducts() {
        return this.productService.getAllProducts();
    }

    @PostMapping("/store/order/get")
    public Product addingProduct(@RequestBody ProductRequest productRequest) throws IllegalAccessException {
        return this.productService.addProduct(productRequest);
    }
}
