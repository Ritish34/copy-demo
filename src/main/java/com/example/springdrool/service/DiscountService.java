package com.example.springdrool.service;

import com.example.springdrool.model.Order;
import com.example.springdrool.model.User;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {

    @Autowired
    private KieContainer container;

    public int getDiscount(Order order) {

        KieSession session = container.newKieSession();
        User user = new User();
        user.setId(1);
        user.setEmail("dhruvi2@gmail.com");
        user.setSalary(50000);


        session.insert(order);
        session.insert(user);
        session.fireAllRules();
        session.dispose();

        return order.getDiscount();
    }
}
