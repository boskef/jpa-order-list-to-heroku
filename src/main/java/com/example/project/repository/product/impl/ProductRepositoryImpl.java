package com.example.project.repository.product.impl;

import com.example.project.jpaFactory.JpaFactory;
import com.example.project.jpaFactory.impl.JpaFactoryImpl;
import com.example.project.model.Product;
import com.example.project.repository.product.ProductRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    private JpaFactory jpaFactory = new JpaFactoryImpl();
    private EntityManager entityManager = jpaFactory.getEntityManager();
    private EntityTransaction entityTransaction = entityManager.getTransaction();

    @Override
    public void addProduct(Product product) {
        entityTransaction.begin();
        entityManager.persist(product);
        entityTransaction.commit();

    }

    @Override
    public Product editProduct(Product product) {
        entityTransaction.begin();
        entityManager.merge(product);
        entityTransaction.commit();

        return product;
    }

    @Override
    public void removeProduct(Product product) {
        entityTransaction.begin();
        entityManager.remove(product);
        entityTransaction.commit();
    }

    @Override
    public Product findProduct(int productId) {
        entityTransaction.begin();
        Product product = entityManager.find(Product.class, productId);
        entityTransaction.commit();

        return product;
    }

    @Override
    public List<Product> findAllProductList() {
        entityTransaction.begin();
        TypedQuery<Product> typedQuery = entityManager.createNamedQuery("Product.findAllProducts", Product.class);
        List<Product> productList = typedQuery.getResultList();
        entityTransaction.commit();

        return productList;
    }

    @Override
    public Product findProductByProductName(String productName) {
        entityTransaction.begin();
        TypedQuery<Product> typedQuery = entityManager.createNamedQuery("Product.findProductByProductName", Product.class);
        typedQuery.setParameter("productName", productName);
        Product product =  typedQuery.getSingleResult();
        entityTransaction.commit();

        return product;
    }

    @Override
    public List<Product> findProductByLikeEndProductName(String suffixProductName) {
        entityTransaction.begin();
        TypedQuery<Product> typedQuery = entityManager.createNamedQuery("Product.findProductByLikeProductName", Product.class);
        typedQuery.setParameter("productName", "%" + suffixProductName);

        List<Product> productList = typedQuery.getResultList();
        entityTransaction.commit();

        return productList;
    }

    @Override
    public List<Product> findProductByLikeStartProductName(String prefixProductName) {
        entityTransaction.begin();
        TypedQuery<Product> typedQuery = entityManager.createNamedQuery("Product.findProductByLikeProductName", Product.class);
        typedQuery.setParameter("productName", prefixProductName + "%");
        List<Product> productList = typedQuery.getResultList();
        entityTransaction.commit();

        return productList;
    }
}
