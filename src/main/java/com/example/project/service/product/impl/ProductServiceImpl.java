package com.example.project.service.product.impl;

import com.example.project.model.Product;
import com.example.project.repository.product.ProductRepository;
import com.example.project.repository.product.impl.ProductRepositoryImpl;
import com.example.project.service.product.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    @Override
    public Product editProduct(Product product) {
       return productRepository.editProduct(product);
    }

    @Override
    public void removeProduct(Product product) {
        productRepository.removeProduct(product);
    }

    @Override
    public Product findProduct(int productId) {
        return productRepository.findProduct(productId);
    }

    @Override
    public List<Product> findAllProductList() {
        return productRepository.findAllProductList();
    }

    @Override
    public Product findProductByProductName(String productName) {
        return productRepository.findProductByProductName(productName);
    }

    @Override
    public List<Product> findProductByLikeEndProductName(String suffixProductName) {
        return productRepository.findProductByLikeEndProductName(suffixProductName);
    }

    @Override
    public List<Product> findProductByLikeStartProductName(String prefixProductName) {
        return productRepository.findProductByLikeStartProductName(prefixProductName);
    }
}
