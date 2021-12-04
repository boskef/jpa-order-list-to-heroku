package com.example.project.repository.order.impl;

import com.example.project.jpaFactory.JpaFactory;
import com.example.project.jpaFactory.impl.JpaFactoryImpl;
import com.example.project.model.Order;
import com.example.project.repository.order.OrderRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

public class OrderRepositoryImpl implements OrderRepository {

    JpaFactory jpaFactory = new JpaFactoryImpl();
    EntityManager entityManager = jpaFactory.getEntityManager();
    EntityTransaction entityTransaction = jpaFactory.getEntityTransaction();

    @Override
    public void addOrder(Order order) {
        entityTransaction.begin();
        entityManager.persist(order);
        entityTransaction.commit();
    }

    @Override
    public Order editOrder(Order order) {
        entityTransaction.begin();
        entityManager.merge(order);
        entityTransaction.commit();
        return order;
    }

    @Override
    public void removeOrder(Order order) {
        entityTransaction.begin();
        entityManager.remove(order);
        entityTransaction.commit();
    }

    @Override
    public Order findOrderById(int orderId) {
        entityTransaction.begin();
        Order order = entityManager.find(Order.class, orderId);
        entityTransaction.commit();
        return order;
    }

    @Override
    public List<Order> findAllOrderList() {
        entityTransaction.begin();
        TypedQuery<Order> typedQuery = entityManager.createNamedQuery("Order.findAllOrders", Order.class);
        entityTransaction.commit();
        return typedQuery.getResultList();
    }

    @Override
    public List<Order> findOrdersBetweenDate(Date startDate, Date endDate) {
        entityTransaction.begin();
        TypedQuery<Order> typedQuery = entityManager.createNamedQuery("Order.findOrdersBetweenDate", Order.class);
        entityTransaction.commit();
        return typedQuery.getResultList();
    }

}
