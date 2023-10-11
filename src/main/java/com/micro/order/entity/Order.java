package com.micro.order.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order", schema = "public")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private long amount;

    private String surname;

    private String name;

    private String address;
}
