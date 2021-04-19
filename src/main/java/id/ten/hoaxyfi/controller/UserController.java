package id.ten.hoaxyfi.controller;

import id.ten.hoaxyfi.model.User;
import id.ten.hoaxyfi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/api/1.0/users")
    void postUser(@RequestBody User user) {
        userService.save(user);

    }

}
