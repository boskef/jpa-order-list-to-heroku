package com.example.project.repository.product.impl;

import com.example.project.model.Product;
import com.example.project.repository.product.ProductRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Unit test for {@link ProductRepository}
 *
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
public class ProductRepositoryImplTest {

    private ProductRepository productRepository;
    private Product product;

    @Before
    public void setUp() throws Exception {
        productRepository = mock(ProductRepository.class);
        product = mock(Product.class);
    }

    @Test
    public void testAddProduct() {
        productRepository.addProduct(product);
    }

    @Test
    public void testEditProduct() {
        when(productRepository.editProduct(product)).thenReturn(product);
    }

    @Test
    public void testRemoveProduct() {
        productRepository.removeProduct(product);
    }

    @Test
    public void testFindProduct() {
        when(productRepository.findProduct(1)).thenReturn(product);
    }

    @Test
    public void testFindAllProductList() {
        when(productRepository.findAllProductList()).thenReturn(new ArrayList<Product>());
    }

    @Test
    public void testFindProductByProductName() {
        when(productRepository.findProductByProductName("productName")).thenReturn(product);
    }

    @Test
    public void testFindProductByLikeEndProductName() {
        when(productRepository.findProductByLikeEndProductName("productName")).thenReturn(new ArrayList<Product>());
    }

    @Test
    public void testFindProductByLikeStartProductName() {
        when(productRepository.findProductByLikeStartProductName("productName")).thenReturn(new ArrayList<Product>());
    }

}
