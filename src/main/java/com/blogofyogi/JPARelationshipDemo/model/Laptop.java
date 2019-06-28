package com.blogofyogi.JPARelationshipDemo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Laptop {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer lid;
    private String brand;
}
