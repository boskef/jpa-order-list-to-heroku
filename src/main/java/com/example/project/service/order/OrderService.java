package com.example.project.service.order;

import com.example.project.model.Order;

import java.util.Date;
import java.util.List;

public interface OrderService {
    void addOrder(Order order);
    Order editOrder(Order order);
    void removeOrder(Order order);
    Order findOrderById(int orderId);
    List<Order> findAllOrderList();

    //new methods. we will execute named queries for our test projects.
    List<Order> findOrdersBetweenDate(Date startDate, Date endDate);
}
