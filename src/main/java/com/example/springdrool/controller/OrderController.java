package com.example.springdrool.controller;

import com.example.springdrool.model.Order;
import com.example.springdrool.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private DiscountService discountService;

    @PostMapping("/getDiscount")
    public int getDiscount(@RequestBody Order order){
        return discountService.getDiscount(order);
    }

    @GetMapping("/")
    public String greet(){
        System.out.println("Hellooooooo");
        return "<h2>Helloooo</h2>";
    }
}
