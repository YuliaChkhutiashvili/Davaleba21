package com.example.demo.model;


import jakarta.persistence.*;
import org.springframework.stereotype.Repository;

@Entity
@Table (name = "phone")
public class Phone {

    @Id

    private Long id;
    private String modelName;
    private String brandName;
    private Double price;
}
