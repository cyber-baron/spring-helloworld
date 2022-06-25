package com.example.springhelloworld.controller;

import com.example.springhelloworld.entity.Book;
import com.example.springhelloworld.entity.User;
import com.example.springhelloworld.service.BookService;
import com.example.springhelloworld.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/find/{userId}")
    public ResponseEntity<User> findUserById(@PathVariable Long userId) {
        return ResponseEntity.ok(userService.findById(userId));
    }

    @PostMapping("/create")
    public ResponseEntity<User> createBook(@RequestBody User user) {
        return ResponseEntity.ok(userService.create(user));
    }

    @PutMapping("/update")
    public ResponseEntity<User> updateBook(@RequestBody User user) {
        return ResponseEntity.ok(userService.update(user));
    }

    @DeleteMapping("/delete/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateBook(@PathVariable Long userId) {
        userService.delete(userId);
    }
}
