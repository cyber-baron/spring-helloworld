package com.example.springhelloworld.service;

import com.example.springhelloworld.entity.HelloWorldEntity;
import com.example.springhelloworld.repository.HelloWorldRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Getter
@Setter
public class HelloWorldServiceImpl implements HelloWorldService {

    private final HelloWorldRepository helloWorldRepository;
    private Long ids = 3L;

    public HelloWorldServiceImpl(HelloWorldRepository algorithmRepository) {
        this.helloWorldRepository = algorithmRepository;
    }

    @Override
    public Optional<HelloWorldEntity> getUser() {
        return helloWorldRepository.findUserById(ids);
    }
}
