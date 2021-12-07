package com.example.project.service.product.impl;

import com.example.project.model.Product;
import com.example.project.service.product.ProductService;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Unit test for {@link ProductServiceImpl}
 *
 * @author Kayhan Öztürk
 * @version 0.1
 * @since   0.1
 */
public class ProductServiceImplTest {

    private ProductService productService;
    private Product product;

    @Before
    public void setUp() throws Exception {
        productService = mock(ProductService.class);
        product = mock(Product.class);
    }

    @Test
    public void testAddProduct(){
        productService.addProduct(product);
    }

    @Test
    public void testEditProduct(){
        when(productService.editProduct(product)).thenReturn(product);
    }

    @Test
    public void testRemoveProduct(){
        productService.removeProduct(product);
    }

    @Test
    public void testFindProduct(){
        when(productService.findProduct(1)).thenReturn(product);
    }

    @Test
    public void testFindAllProductList(){
        when(productService.findAllProductList()).thenReturn(new ArrayList<Product>());
    }

    @Test
    public void testFindProductByProductName(){
        when(productService.findProductByProductName("prodName")).thenReturn(product);
    }

    @Test
    public void testFindProductByLikeEndProductName(){
        when(productService.findProductByLikeEndProductName("prodName")).thenReturn(new ArrayList<Product>());
    }

    @Test
    public void testFindProductByLikeStartProductName(){
        when(productService.findProductByLikeStartProductName("prodName")).thenReturn(new ArrayList<Product>());
    }

}