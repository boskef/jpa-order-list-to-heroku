package com.example.project.service.product;

import com.example.project.model.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);
    Product editProduct(Product product);
    void removeProduct(Product product);
    Product findProduct(int productId);
    List<Product> findAllProductList();

    //new methods. we will execute named queries for our test projects.
    Product findProductByProductName(String productName);
    List<Product> findProductByLikeEndProductName(String suffixProductName);
    List<Product> findProductByLikeStartProductName(String prefixProductName);
}
