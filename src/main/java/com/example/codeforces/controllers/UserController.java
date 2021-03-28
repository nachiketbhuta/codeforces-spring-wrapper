package com.example.codeforces.controllers;

import com.example.codeforces.models.users.UserBlogsResponseDTO;
import com.example.codeforces.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{username}/blogs")
    public ResponseEntity<UserBlogsResponseDTO> getBlogs(@PathVariable("username") String username) {
        return ResponseEntity.ok(userService.getBlogs(username));
    }
}
