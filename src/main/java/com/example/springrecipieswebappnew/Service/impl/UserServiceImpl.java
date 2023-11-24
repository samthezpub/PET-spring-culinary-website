package com.example.springrecipieswebappnew.Service.impl;

import com.example.springrecipieswebappnew.Entity.Role;
import com.example.springrecipieswebappnew.Entity.UserEntity;
import com.example.springrecipieswebappnew.Repository.UserRepository;
import com.example.springrecipieswebappnew.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private PasswordEncoder encoder;

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

    /**
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("In the user details service");
        if (!username.equals("user")){
            throw  new UsernameNotFoundException("Not Ethan");
        }

        Set<Role> roles = new HashSet<>();
        roles.add(new Role(1L, "USER"));

        return new UserEntity(1L, "user", encoder.encode("password"), roles);
    }
}
