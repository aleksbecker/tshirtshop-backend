package com.turing.tshirtshop.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turing.tshirtshop.entity.Order;
import com.turing.tshirtshop.repository.OrderRepository;

@RestController
@CrossOrigin(origins = "*")
public class OrderController {



    @Autowired
    private OrderRepository orderRepository;
    
   
    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    
    @PostMapping("/orders")
    public void createOrder() {
    }
    
    @GetMapping("/orders/{id}")
    public Optional<Order> getOrderById(@PathVariable(value = "id") Long id)  {
    	return orderRepository.findById(id);
    }
    
    @GetMapping("/orders/inCustomer")
    public List<Order> getOrderByCustomer()   {
    	return null;
    }
    
    @GetMapping("/orders/shortDetail/{orderId}")
    public  Optional<Order> getShortDetail(@PathVariable(value = "orderId") Long orderId)   {
    	return orderRepository.findById(orderId);
    }
     
    
}
