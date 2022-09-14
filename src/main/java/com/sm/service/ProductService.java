package com.sm.service;

import com.sm.entity.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private static Map<Long, Product> map = new HashMap<>();
    private static long id = 0;

    public Product saveProduct(Product product) {
        id += 1;
        product.setId(id);
        return map.put(id, product);
    }

    public List<Product> getProducts() {
        return map.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
    }

    public Product getProductById(Long id) {
        return map.getOrDefault(id, null);
    }

}
