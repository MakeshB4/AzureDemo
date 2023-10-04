package com.demo.service;


import com.demo.entity.User;

import java.util.List;

public interface UserService {
    Long addUser(User user);

    User getUser(Long userId);

    void deleteUser(Long userId);

    User editUser(User user);

    List<User> getAllUsers();

}
