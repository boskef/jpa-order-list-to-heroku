package com.example.project.controller;

import com.example.project.model.Order;
import com.example.project.model.Product;
import com.example.project.service.order.OrderService;
import com.example.project.service.order.impl.OrderServiceImpl;
import com.example.project.service.product.ProductService;
import com.example.project.service.product.impl.ProductServiceImpl;

import java.util.List;


public class TestFind {

    public static void main(String[] args) {

        ProductService productService = new ProductServiceImpl();
        Product product = productService.findProduct(1);
        System.out.println(product.toString());

        List<Product> productList = productService.findProductByLikeStartProductName("PC");

        System.out.println(productList.get(0).getProduct_name());

        OrderService orderService = new OrderServiceImpl();
        Order order = orderService.findOrderById(1);

        System.out.println(order.toString());
    }
}
