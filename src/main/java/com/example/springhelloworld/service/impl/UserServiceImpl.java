package com.example.springhelloworld.service.impl;

import com.example.springhelloworld.entity.User;
import com.example.springhelloworld.repository.UserRepository;
import com.example.springhelloworld.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User findById(Long userId) {
        return userRepository.findById(userId).orElseThrow(() -> new EntityNotFoundException("Пользователь с идентификатором: " + userId + " не найден"));
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        User updateUser = userRepository.findByUserId((long) user.getUserId());
        updateUser.setUserName(user.getUserName());
        updateUser.setUserSurname(user.getUserSurname());
        updateUser.setUserSecondName(user.getUserSecondName());
        updateUser.setUserPhoneNumber(user.getUserPhoneNumber());

        return userRepository.save(updateUser);
    }

    @Override
    public void delete(Long userId) {
        userRepository.delete(userRepository.findByUserId(userId));
    }
}
