package com.example.springrecipieswebappnew.Service.impl;

import com.example.springrecipieswebappnew.Entity.UserEntity;
import com.example.springrecipieswebappnew.Repository.UserRepository;
import com.example.springrecipieswebappnew.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * @param user
     */
    @Override
    public void createUser(UserEntity user) {
        userRepository.save(user);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<UserEntity> findUserById(Long id) {
        return userRepository.findById(id);
    }

    /**
     * @param user
     */
    @Override
    public void updateUser(UserEntity user) {
        userRepository.save(user);
    }

    /**
     * @param user
     */
    @Override
    public void deleteUser(UserEntity user) {
        userRepository.delete(user);
    }
}
