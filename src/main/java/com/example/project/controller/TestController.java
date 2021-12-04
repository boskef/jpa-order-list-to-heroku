package com.example.project.controller;

import com.example.project.model.Order;
import com.example.project.model.Product;
import com.example.project.model.User;
import com.example.project.service.order.OrderService;
import com.example.project.service.order.impl.OrderServiceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestController {

    public static void main(String[] args) {
        // ProductService productService = new ProductServiceImpl();

        //setting new products.
        Product product1 = new Product("Computer", "10000", new java.util.Date());
        Product product2 = new Product("Phone", "5000", new java.util.Date());
        Product product3 = new Product("PC Screen", "3000", new java.util.Date());

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        //setting new userInfo.
        User user1 = new User("James", "Hetfield", "9092021", new Date());
        User user2 = new User("Kirk", "Hammet", "9891203", new Date());

        Order order1 = new Order();
        order1.setOrder_created_date(new Date());
        order1.setProductList(productList);
        order1.setUser(user1);

        Order order2 = new Order(productList, user2, new Date());

        OrderService orderService = new OrderServiceImpl();
        orderService.addOrder(order1);
        orderService.addOrder(order2);
       /*
        productService.addProduct(product1);
        productService.addProduct(product2);
        productService.addProduct(product3);
       */

    }
}
