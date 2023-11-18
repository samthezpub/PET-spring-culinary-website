package com.example.springrecipieswebappnew.Service;

import com.example.springrecipieswebappnew.Entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {
    void createUser(UserEntity user);
    Optional<UserEntity> findUserById(Long id);
    void updateUser(UserEntity user);
    void deleteUser(UserEntity user);

}
