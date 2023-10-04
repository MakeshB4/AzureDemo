package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    // private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    private static final Logger LOGGER = LogManager.getLogger(UserController.class);

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/addUser")
    public Long addUser(@RequestBody User user) {
        LOGGER.info("In  add User {}", user);
        return userService.addUser(user);
    }

    @GetMapping("/getUserById/{id}")
    public User getUserDetails(@PathVariable Long id) {
        LOGGER.info("In  getUserDetails {}", id);
        return userService.getUser(id);
    }

    @PutMapping("/editUserDetails/{id}")
    public User editUserDetails(@PathVariable(value = "id") Long userId, @RequestBody User user) {
        LOGGER.info("In  editUserDetails for id  {} and user Details {}", userId, user);
        User userDetails = userService.getUser(userId);
        userDetails.setAge(user.getAge());
        userDetails.setAddress(user.getAddress());
        userDetails.setEmailId(user.getEmailId());
        userDetails.setLastName(user.getLastName());
        userDetails.setFirstName(user.getFirstName());
        return userService.editUser(userDetails);
    }

    @DeleteMapping("/deleteUserById/{id}")
    public void deleteUser(@PathVariable Long id) {
        LOGGER.info("In  deleteUser {}",id);
        userService.deleteUser(id);
    }

    @GetMapping("/getAllUsers")
    public List<User> getUsersAll() {
        LOGGER.info("In getUsersAll {}");
        return userService.getAllUsers();
    }

}
