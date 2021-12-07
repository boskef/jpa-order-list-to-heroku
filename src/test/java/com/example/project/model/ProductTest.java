package com.example.project.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Date;

/**
 * Unit test for {@link Product}
 *
 * @author Kayhan Öztürk
 * @version 0.1
 * @since   0.1
 */
public class ProductTest {

    private Product product;
    @Before
    public void setUp() throws Exception {
        product = new Product();

        product.setProduct_id(1);
        product.setProduct_name("prodName");
        product.setProduct_price("prodPrice");
        product.setProduct_created_date(new Date());
    }

    @Test
    public void testGetter(){
        Assert.assertNotNull(product);

        Assert.assertNotNull(product.getProduct_id());
        Assert.assertNotNull(product.getProduct_name());
        Assert.assertNotNull(product.getProduct_price());
        Assert.assertNotNull(product.getProduct_created_date());
    }
}
