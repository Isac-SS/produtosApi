package com.github.isacss.produtosapi.repository;

import com.github.isacss.produtosapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

}
