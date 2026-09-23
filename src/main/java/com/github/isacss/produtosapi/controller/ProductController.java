package com.github.isacss.produtosapi.controller;

import com.github.isacss.produtosapi.model.Product;
import com.github.isacss.produtosapi.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        var productId = UUID.randomUUID().toString();
        product.setId(productId);
        return productRepository.save(product);
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") String id) {
        // Optional<Product> product = productRepository.findById(id);
        // return product.isPresent() ? product.get() : null;

        // Com optional
        return productRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") String id) {
        productRepository.deleteById(id);
    }

    @PostMapping("{id}")
    public void productUpdate(
            @PathVariable("id") String id,
            @RequestBody Product product
    ){
        product.setId(id);
        productRepository.save(product);
    }
}
