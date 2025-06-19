package com.ecommerce.userservice.service;

import com.ecommerce.userservice.dto.UserRequest;
import com.ecommerce.userservice.dto.UserResponse;
import com.ecommerce.userservice.repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserRepository userRepository;

    @Override
    public UserResponse createUser(UserRequest userRequest) {
        return null;
    }

    @Override
    public List<UserResponse> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserResponse getUserById(Long id) {
        return null;
    }

    @Override
    public UserResponse updateUser(Long id, UserRequest userRequest) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
