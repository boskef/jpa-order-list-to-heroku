package com.example.project.service.user.impl;

import com.example.project.model.User;
import com.example.project.service.user.UserService;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Unit test for {@link UserServiceImpl}
 *
 * @author Kayhan Öztürk
 * @version 0.1
 * @since   0.1
 */
public class UserServiceImplTest {

    private UserService userService;
    private User user;

    @Before
    public void setUp() throws Exception {
        userService = mock(UserService.class);
        user = mock(User.class);
    }

    @Test
    public void testAddUser(){
        userService.addUser(user);
    }

    @Test
    public void testEditUser(){
        when(userService.editUser(user)).thenReturn(user);
    }

    @Test
    public void testRemoveUser(){
        userService.removeUser(user);
    }

    @Test
    public void testFindUserById(){
        when(userService.findUserById(1)).thenReturn(user);
    }

    @Test
    public void testFindAllUsersList(){
        when(userService.findAllUsersList()).thenReturn(new ArrayList<User>());
    }

    @Test
    public void testFindUserByName(){
        when(userService.findUserByName()).thenReturn(user);
    }

    @Test
    public void testFindUserByLikeStartName(){
        when(userService.findUserByLikeStartName()).thenReturn(new ArrayList<User>());
    }

    @Test
    public void testFindUserByLikeEndName(){
        when(userService.findUserByLikeEndName()).thenReturn(new ArrayList<User>());
    }
}
