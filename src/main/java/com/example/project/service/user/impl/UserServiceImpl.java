package com.example.project.service.user.impl;

import com.example.project.model.User;
import com.example.project.repository.user.UserRepository;
import com.example.project.repository.user.impl.UserRepositoryImpl;
import com.example.project.service.user.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public void addUser(User user) {
        userRepository.addUser(user);
    }

    @Override
    public User editUser(User user) {
        return userRepository.editUser(user);
    }

    @Override
    public void removeUser(User user) {
        userRepository.removeUser(user);
    }

    @Override
    public User findUserById(int userId) {
        return userRepository.findUserById(userId);
    }

    @Override
    public List<User> findAllUsersList() {
        return userRepository.findAllUsersList();
    }

    @Override
    public User findUserByName() {
        return userRepository.findUserByName();
    }

    @Override
    public List<User> findUserByLikeStartName() {
        return userRepository.findUserByLikeStartName();
    }

    @Override
    public List<User> findUserByLikeEndName() {
        return userRepository.findUserByLikeEndName();
    }
}
