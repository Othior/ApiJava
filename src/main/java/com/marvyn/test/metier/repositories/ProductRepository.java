package com.marvyn.test.metier.repositories;

import com.marvyn.test.metier.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer>{

	Product findByName(String name);

}