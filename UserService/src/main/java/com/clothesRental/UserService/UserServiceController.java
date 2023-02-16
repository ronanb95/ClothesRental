package com.clothesRental.UserService;

import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clothesRental.Common.models.User;

@RestController
public class UserServiceController {

    @Autowired
    UserService userService;

    @PostMapping("/")
    public ResponseEntity<?> createUser(@RequestBody User user){
        try {
            userService.createUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ResponseEntity.ok("User created");
    }
    
}
