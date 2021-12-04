package com.example.project.service.user;

import com.example.project.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    User editUser(User user);
    void removeUser(User user);
    User findUserById(int userId);
    List<User> findAllUsersList();

    User findUserByName();
    List<User> findUserByLikeStartName();
    List<User> findUserByLikeEndName();
}
