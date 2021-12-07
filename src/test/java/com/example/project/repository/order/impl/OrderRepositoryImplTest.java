package com.example.project.repository.order.impl;

import com.example.project.model.Order;
import com.example.project.repository.order.OrderRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Unit test for {@link OrderRepository}
 *
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
public class OrderRepositoryImplTest {

    private OrderRepository orderRepository;
    private Order order;

    @Before
    public void setUp() throws Exception {
        orderRepository = mock(OrderRepository.class);
        order = mock(Order.class);
    }

    @Test
    public void testAddOrder() {
        orderRepository.addOrder(order);
    }

    @Test
    public void testEditOrder() {
        when(orderRepository.editOrder(order)).thenReturn(order);
    }

    @Test
    public void testRemoveOrder() {
        orderRepository.removeOrder(order);
    }

    @Test
    public void testFindOrderById() {
        when(orderRepository.findOrderById(1)).thenReturn(order);
    }

    @Test
    public void testFindAllOrderList() {
        when(orderRepository.findAllOrderList()).thenReturn(new ArrayList<Order>());
    }
}
