package com.demo.service;



import com.demo.entity.Users;

import java.util.List;

public interface UserService {
    Long addUser(Users user);

    Users getUser(Long userId);

    void deleteUser(Long userId);

    Users editUser(Users user);

    List<Users> getAllUsers();

}
