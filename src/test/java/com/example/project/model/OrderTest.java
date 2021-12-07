package com.example.project.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Unit test for {@link Order}
 *
 * @author Kayhan Öztürk
 * @version 0.1
 * @since   0.1
 */
public class OrderTest {

    private Order order;
    private List<Product> productList = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        order = new Order();

        order.setOrder_id(1);
        order.setOrder_created_date(new Date());

        productList.add(new Product("Computer","price", new Date()));

        order.setProductList(productList);
        order.setUser(new User("username","surname","phoneNumber", new Date()));
    }

    @Test
    public void testGetter(){
        Assert.assertNotNull(order);

        Assert.assertNotNull(order.getOrder_id());
        Assert.assertNotNull(order.getOrder_created_date());
        Assert.assertNotNull(order.getProductList());
        Assert.assertNotNull(order.getUser());
    }
}
