package com.example.springhelloworld.service;

import com.example.springhelloworld.entity.User;

public interface UserService {

    User findById(Long userId);

    User create(User user);
    User update(User user);
    void delete(Long userId);
}
