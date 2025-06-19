package com.ecommerce.userservice.service;

import com.ecommerce.userservice.dto.UserRequest;
import com.ecommerce.userservice.dto.UserResponse;
import com.ecommerce.userservice.entity.User;
import com.ecommerce.userservice.exception.ResourceNotFoundException;
import com.ecommerce.userservice.repository.UserRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test; // JUnit 5 Test
import org.mockito.InjectMocks;  // Injects the real UserServiceImpl
import org.mockito.Mock;        // Creates mock of UserRepository
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*; // For assertEquals
import static org.mockito.Mockito.*;             // For when(), any()

/**
 * Unit tests for UserServiceImpl using JUnit 5 and Mockito.
 */
public class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl userService; // The service we are testing

    @Mock
    private UserRepository userRepository; // Mocking the repository

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks before each test
    }

    @Test
    void testCreateUser() {
        // Arrange: Create dummy UserRequest and expected User entity
        UserRequest request = new UserRequest("John", "Doe", "john.doe@test.com", "pass123");
        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        // Mocking: When save() is called, return 'user'
        when(userRepository.save(any(User.class))).thenReturn(user);

        // Act: Call the service method
        UserResponse response = userService.createUser(request);

        // Assert: Check response data matches input
        assertEquals("John", response.getFirstName());
        assertEquals("Doe", response.getLastName());
    }

    @Test
    void testGetUserById_UserExists() {
        // Arrange
        User user = new User();
        user.setId(1L);
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmail("john.doe@test.com");

        // Mocking: findById returns user
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        // Act
        UserResponse response = userService.getUserById(1L);

        // Assert
        assertEquals("John", response.getFirstName());
    }

    @Test
    void testGetUserById_UserNotFound() {
        // Mocking: findById returns empty
        when(userRepository.findById(2L)).thenReturn(Optional.empty());

        // Assert exception thrown
        assertThrows(ResourceNotFoundException.class, () -> userService.getUserById(2L));
    }
}
