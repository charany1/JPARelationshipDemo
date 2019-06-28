package com.blogofyogi.JPARelationshipDemo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Laptop {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer lid;
    private String brand;

    @ManyToMany
    private List<User> users;
}
