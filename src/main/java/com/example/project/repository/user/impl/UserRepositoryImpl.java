package com.example.project.repository.user.impl;

import com.example.project.jpaFactory.JpaFactory;
import com.example.project.jpaFactory.impl.JpaFactoryImpl;
import com.example.project.model.User;
import com.example.project.repository.user.UserRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    JpaFactory jpaFactory = new JpaFactoryImpl();
    EntityManager entityManager = jpaFactory.getEntityManager();
    EntityTransaction entityTransaction = jpaFactory.getEntityTransaction();

    @Override
    public void addUser(User user) {
        entityTransaction.begin();
        entityManager.persist(user);
        entityTransaction.commit();
    }

    @Override
    public User editUser(User user) {
        entityTransaction.begin();
        entityManager.merge(user);
        entityTransaction.commit();
        return user;
    }

    @Override
    public void removeUser(User user) {
        entityTransaction.begin();
        entityManager.remove(user);
        entityTransaction.commit();
    }

    @Override
    public User findUserById(int userId) {
        entityTransaction.begin();
        User user = entityManager.find(User.class, userId);
        entityTransaction.commit();
        return user;
    }

    @Override
    public List<User> findAllUsersList() {
        entityTransaction.begin();
        TypedQuery<User> typedQuery = entityManager.createQuery("SELECT u FROM User", User.class);
        entityTransaction.commit();

        return typedQuery.getResultList();
    }

    @Override
    public User findUserByName() {
       entityTransaction.begin();
       TypedQuery<User> typedQuery = entityManager.createNamedQuery("User.findUserByName", User.class);
       entityTransaction.commit();

       return typedQuery.getSingleResult();
    }

    @Override
    public List<User> findUserByLikeStartName() {
        entityTransaction.begin();
        TypedQuery<User> typedQuery = entityManager.createNamedQuery("User.findUserLikeStartName", User.class);
        entityTransaction.commit();
        return typedQuery.getResultList();
    }

    @Override
    public List<User> findUserByLikeEndName() {
        entityTransaction.begin();
        TypedQuery<User> typedQuery = entityManager.createNamedQuery("User.findUserLikeEndName", User.class);
        entityTransaction.commit();
        return typedQuery.getResultList();
    }
}
