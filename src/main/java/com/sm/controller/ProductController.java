package com.sm.controller;

import com.sm.entity.Product;
import com.sm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @GetMapping
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable Long id) {
        Product product = service.getProductById(id);
        if(product == null)
            throw new RuntimeException("Product is not found");
        return product;
    }


}
