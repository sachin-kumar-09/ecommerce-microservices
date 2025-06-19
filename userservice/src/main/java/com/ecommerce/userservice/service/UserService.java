package com.ecommerce.userservice.service;

import com.ecommerce.userservice.dto.UserRequest;
import com.ecommerce.userservice.dto.UserResponse;

import java.util.List;


public interface UserService {
    /*
    * createUser(UserRequestDTO dto)	UserResponseDTO
        getUserById(Long id)	UserResponseDTO
        updateUser(Long id, UserRequestDTO dto)	UserResponseDTO
        deleteUser(Long id)	void
        getAllUsers()	List<UserResponseDTO>
*/

    public UserResponse createUser(UserRequest userRequest);
    public List<UserResponse> getAllUsers();
    public UserResponse getUserById(Long id);
    public UserResponse updateUser(Long id, UserRequest userRequest);
    public void deleteUser(Long id);
}
