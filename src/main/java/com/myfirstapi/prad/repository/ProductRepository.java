package com.myfirstapi.prad.repository;

import com.myfirstapi.prad.entitiy.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);
}
