package com.blogofyogi.JPARelationshipDemo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Laptop {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer lid;
    private String brand;
    @ManyToOne
    private User user;
}
