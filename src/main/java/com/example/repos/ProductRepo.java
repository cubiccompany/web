package com.example.repos;

import com.example.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product, Long> {
    List<Product> findByNameProduct(String nameProduct);

    Product findProductById(Long id);

}

