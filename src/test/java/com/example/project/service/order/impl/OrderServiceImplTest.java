package com.example.project.service.order.impl;

import com.example.project.model.Order;
import com.example.project.model.Product;
import com.example.project.model.User;
import com.example.project.service.order.OrderService;
import org.junit.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OrderServiceImplTest {

    OrderService orderService;
    Order order;
    Order order1;
    List<Product> productList;
    Product product;

    @Before
    public void setUp() throws Exception {
        order = mock(Order.class);
        orderService = mock(OrderService.class);

        product = new Product("computer", "19000", new Date());
        productList = new ArrayList<>();
        productList.add(product);
        order1 = new Order(productList, new User("Johnson","Rick","test",new Date()), new Date());

        Assert.assertNotNull(order);
        Assert.assertNotNull(productList);
        Assert.assertNotNull(order1);

    }

    @Test
    public void testAddOrder(){
        orderService.addOrder(order);
    }

    @Test
    public void testEditOrder(){
        when(orderService.editOrder(order1)).thenReturn(order);
    }

    @Test
    public void testRemoveOrder(){
        orderService.removeOrder(order);
    }

    @Test
    public void testFindOrderById(){
        when(orderService.findOrderById(1)).thenReturn(order);
    }

    @Test
    public void testFindAllOrderList(){
        when(orderService.findAllOrderList()).thenReturn(new ArrayList<Order>());
    }

    @Test
    public void testFindOrdersBetweenDate(){
        when(orderService.findOrdersBetweenDate(new Date(), new Date())).thenReturn(new ArrayList<Order>());
    }
}