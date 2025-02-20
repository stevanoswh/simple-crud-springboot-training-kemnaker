package com.example.demo.repository;

import com.example.demo.model.Product;
import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> findAll();
    Optional<Product> findById(Long id);
    Product save(Product product);
    Product update(Product product);
    void deleteById(Long id);
}