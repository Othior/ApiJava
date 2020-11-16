package com.marvyn.test.metier.entities;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int quantity;

    private double price;

}