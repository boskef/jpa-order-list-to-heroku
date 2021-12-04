package com.example.project.service.order.impl;

import com.example.project.model.Order;
import com.example.project.repository.order.OrderRepository;
import com.example.project.repository.order.impl.OrderRepositoryImpl;
import com.example.project.service.order.OrderService;

import java.util.Date;
import java.util.List;

public class OrderServiceImpl implements OrderService {

    OrderRepository orderRepository = new OrderRepositoryImpl();

    @Override
    public void addOrder(Order order) {
        orderRepository.addOrder(order);
    }

    @Override
    public Order editOrder(Order order) {
        return orderRepository.editOrder(order);
    }

    @Override
    public void removeOrder(Order order) {
        orderRepository.removeOrder(order);
    }

    @Override
    public Order findOrderById(int orderId) {
        return orderRepository.findOrderById(orderId);
    }

    @Override
    public List<Order> findAllOrderList() {
        return orderRepository.findAllOrderList();
    }

    @Override
    public List<Order> findOrdersBetweenDate(Date startDate, Date endDate) {
        return orderRepository.findOrdersBetweenDate(startDate, endDate);
    }
}
