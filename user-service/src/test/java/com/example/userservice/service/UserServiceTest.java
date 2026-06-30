package com.example.userservice.service;

import com.example.userservice.dto.UserResponse;
import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

/**
 * UserService 테스트
 * 
 * FIX 테스트: null 검증 로직 테스트 추가
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("UserService 테스트")
class UserServiceTest {
    
    @Mock
    private UserRepository userRepository;
    
    @InjectMocks
    private UserService userService;
    
    private User testUser;
    
    @BeforeEach
    void setUp() {
        testUser = User.builder()
            .id(1L)
            .name("John Doe")
            .email("john@example.com")
            .build();
    }
    
    @Test
    @DisplayName("should_returnUser_when_userIdExists")
    void testGetUserById_Success() {
        // Given
        when(userRepository.findById(1L)).thenReturn(Optional.of(testUser));
        
        // When
        UserResponse response = userService.getUserById(1L);
        
        // Then
        assertThat(response)
            .isNotNull()
            .satisfies(user -> {
                assertThat(user.getId()).isEqualTo(1L);
                assertThat(user.getName()).isEqualTo("John Doe");
            });
    }
    
    @Test
    @DisplayName("should_throwException_when_userIdIsNull")
    void testGetUserById_NullUserId() {
        // When & Then
        assertThatThrownBy(() -> userService.getUserById(null))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("User ID cannot be null");
    }
    
    @Test
    @DisplayName("should_throwException_when_userIdNotFound")
    void testGetUserById_UserNotFound() {
        // Given
        when(userRepository.findById(anyLong())).thenReturn(Optional.empty());
        
        // When & Then
        assertThatThrownBy(() -> userService.getUserById(999L))
            .isInstanceOf(UserNotFoundException.class)
            .hasMessageContaining("User not found");
    }
    
    @Test
    @DisplayName("should_returnAllUsers_when_usersExist")
    void testGetAllUsers_Success() {
        // Given
        List<User> users = List.of(testUser);
        when(userRepository.findAll()).thenReturn(users);
        
        // When
        List<UserResponse> responses = userService.getAllUsers();
        
        // Then
        assertThat(responses)
            .isNotEmpty()
            .hasSize(1)
            .allSatisfy(user -> assertThat(user.getId()).isEqualTo(1L));
    }
    
    @Test
    @DisplayName("should_returnEmptyList_when_getAllUsersReturnsNull")
    void testGetAllUsers_RepositoryReturnsNull() {
        // Given
        when(userRepository.findAll()).thenReturn(null);
        
        // When
        List<UserResponse> responses = userService.getAllUsers();
        
        // Then
        assertThat(responses)
            .isNotNull()
            .isEmpty();
    }
    
    @Test
    @DisplayName("should_returnEmptyList_when_noUsersExist")
    void testGetAllUsers_Empty() {
        // Given
        when(userRepository.findAll()).thenReturn(List.of());
        
        // When
        List<UserResponse> responses = userService.getAllUsers();
        
        // Then
        assertThat(responses)
            .isNotNull()
            .isEmpty();
    }
    
    @Test
    @DisplayName("should_throwException_when_nameIsBlank")
    void testCreateUser_BlankName() {
        // When & Then
        assertThatThrownBy(() -> userService.createUser("", "test@example.com"))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("User name cannot be blank");
    }
    
    @Test
    @DisplayName("should_throwException_when_emailIsBlank")
    void testCreateUser_BlankEmail() {
        // When & Then
        assertThatThrownBy(() -> userService.createUser("John", ""))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("User email cannot be blank");
    }
}
