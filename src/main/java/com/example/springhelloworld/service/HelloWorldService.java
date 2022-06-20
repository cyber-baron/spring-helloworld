package com.example.springhelloworld.service;

import com.example.springhelloworld.entity.HelloWorldEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface HelloWorldService {

    Optional<HelloWorldEntity> getUser();
}
