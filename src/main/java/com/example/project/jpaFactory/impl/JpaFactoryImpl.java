package com.example.project.jpaFactory.impl;

import com.example.project.jpaFactory.JpaFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaFactoryImpl implements JpaFactory {

    private EntityManager entityManager;
    @Override
    public EntityManager getEntityManager() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example-unit");
        this.entityManager = entityManagerFactory.createEntityManager();
        return entityManager;
    }

    @Override
    public EntityTransaction getEntityTransaction() {
        return entityManager.getTransaction();
    }
}

