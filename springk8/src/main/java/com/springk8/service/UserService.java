package com.springk8.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springk8.entity.UserEntity;
import com.springk8.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public UserEntity createUser(String name) {
        UserEntity user = UserEntity.builder()
                .name(name)
                .build();
        return userRepository.save(user);
    }

}
