package com.example.springhelloworld.repository;

import com.example.springhelloworld.entity.Book;
import com.example.springhelloworld.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserById(Long userId);
}
