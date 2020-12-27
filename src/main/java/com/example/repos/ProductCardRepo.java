package com.example.repos;

import com.example.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductCardRepo extends CrudRepository<Product, Long> {

    Product findProductCardById(Integer id);

}
