package com.blogofyogi.JPARelationshipDemo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    @OneToOne
    private Laptop laptop;
}
