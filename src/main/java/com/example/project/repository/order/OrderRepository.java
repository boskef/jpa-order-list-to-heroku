package com.example.project.repository.order;

import com.example.project.model.Order;
import com.example.project.model.Product;

import java.util.Date;
import java.util.List;

public interface OrderRepository {
    void addOrder(Order order);
    Order editOrder(Order order);
    void removeOrder(Order order);
    Order findOrderById(int orderId);
    List<Order> findAllOrderList();

    //new methods. we will execute named queries for our test projects.
    List<Order> findOrdersBetweenDate(Date startDate, Date endDate);
}
