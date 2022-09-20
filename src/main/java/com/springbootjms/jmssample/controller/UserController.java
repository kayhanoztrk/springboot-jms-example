package com.springbootjms.jmssample.controller;

import com.springbootjms.jmssample.model.User;
import com.springbootjms.jmssample.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody User user) {
        userService.sendMessage(user);
        return ResponseEntity.ok(user.getName() + "Name bilgisidir efenim!");
    }
}
