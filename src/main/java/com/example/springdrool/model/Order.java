package com.example.springdrool.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Order {
    private String name;
    private String cardType;
    private int discount;
    private int price;
}
