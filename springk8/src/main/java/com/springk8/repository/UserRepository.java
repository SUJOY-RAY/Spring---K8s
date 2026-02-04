package com.springk8.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springk8.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    
}
