package com.marvyn.test.controller;

import java.util.List;

import com.marvyn.test.metier.entities.Product;
import com.marvyn.test.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    
    @Autowired
    private ProductService service;
    

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return service.addProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.addProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Product findById(@PathVariable int id) {
        return service.getProduct(id);
    }

    @GetMapping("/productByName/{name}")
    public Product findByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }

}
