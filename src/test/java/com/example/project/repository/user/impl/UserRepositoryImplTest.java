package com.example.project.repository.user.impl;

import com.example.project.model.User;
import com.example.project.repository.user.UserRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Unit test for {@link UserRepository}
 *
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
public class UserRepositoryImplTest {

    private UserRepository userRepository;
    private User user;

    @Before
    public void setUp() throws Exception {
        userRepository = mock(UserRepository.class);
        user = mock(User.class);
    }

    @Test
    public void testAddUser() {
        userRepository.addUser(user);
    }

    @Test
    public void testEditUser() {
        when(userRepository.editUser(user)).thenReturn(user);
    }

    @Test
    public void testRemoveUser() {
        userRepository.removeUser(user);
    }

    @Test
    public void testFindUserById() {
        when(userRepository.findUserById(1)).thenReturn(user);
    }

    @Test
    public void testFindAllUsersList() {
        when(userRepository.findAllUsersList()).thenReturn(new ArrayList<User>());
    }

    @Test
    public void testFindUserByName() {
        when(userRepository.findUserByName()).thenReturn(user);
    }

    @Test
    public void testFindUserByLikeStartName() {
        when(userRepository.findUserByLikeStartName()).thenReturn(new ArrayList<User>());
    }

    @Test
    public void testFindUserByLikeEndName() {
        when(userRepository.findUserByLikeEndName()).thenReturn(new ArrayList<User>());
    }


}
