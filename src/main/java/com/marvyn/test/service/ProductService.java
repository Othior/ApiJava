package com.marvyn.test.service;

import java.util.List;

import com.marvyn.test.metier.entities.Product;
import com.marvyn.test.metier.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository;

    public Product addProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> addProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProduct(int id){
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name) {
        return repository.findByName(name);
    }


    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Product updateProduct(Product product){
        Product existingProduct = repository.findById(product.getId()).orElse(null);

        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());

        return repository.save(existingProduct);
    }






}
