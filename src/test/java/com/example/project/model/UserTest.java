package com.example.project.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Unit test for {@link User}
 *
 * @author Kayhan Öztürk
 * @version 0.1
 * @since   0.1
 */
public class UserTest {

    private User user;
    private List<Product> productList = new ArrayList<>();
    private List<Order> orderList = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        user = new User();

        user.setUser_id(1);
        user.setUser_name("username");
        user.setUser_surname("userSurname");
        user.setUser_phone_number("phoneNumber");

        productList.add(new Product("prodName", "prodPrice", new Date()));
        orderList.add(new Order(productList, new User("userName","surname", "phoneNumber", new Date()), new Date()));

        user.setOrderList(orderList);
        user.setUser_created_date(new Date());
        user.setUser_registered_date(new Date());
    }

    @Test
    public void testGetter(){
        Assert.assertNotNull(user);

        Assert.assertNotNull(user.getUser_id());
        Assert.assertNotNull(user.getUser_name());
        Assert.assertNotNull(user.getUser_surname());
        Assert.assertNotNull(user.getUser_phone_number());
        Assert.assertNotNull(user.getOrderList());
        Assert.assertNotNull(user.getUser_created_date());
        Assert.assertNotNull(user.getUser_registered_date());
    }

}
