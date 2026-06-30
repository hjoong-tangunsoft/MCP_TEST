package com.example.userservice.service;

import com.example.userservice.dto.UserResponse;
import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * User Service - 사용자 관리 비즈니스 로직
 * 
 * Fix: NullPointerException 처리 및 null 검증 강화
 * - getUserById() 메서드에 userId null 검증 추가
 * - getAllUsers() 메서드의 null 체크 강화
 * - 명확한 에러 메시지 제공
 */
@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {
    
    private final UserRepository userRepository;
    
    /**
     * 사용자 ID로 사용자 조회
     * 
     * @param userId 사용자 ID
     * @return 사용자 정보
     * @throws IllegalArgumentException userId가 null인 경우
     * @throws UserNotFoundException 사용자를 찾을 수 없는 경우
     */
    public UserResponse getUserById(Long userId) {
        // FIX: userId null 검증 추가
        if (userId == null) {
            log.warn("User ID cannot be null");
            throw new IllegalArgumentException("User ID cannot be null");
        }
        
        User user = userRepository.findById(userId)
            .orElseThrow(() -> {
                log.warn("User not found for userId: {}", userId);
                return new UserNotFoundException("User not found for userId: " + userId);
            });
        
        log.debug("User found: {}", user.getId());
        return UserResponse.from(user);
    }
    
    /**
     * 전체 사용자 조회
     * 
     * @return 사용자 목록
     */
    public List<UserResponse> getAllUsers() {
        List<User> users = userRepository.findAll();
        
        // FIX: null 체크 강화
        if (users == null) {
            log.warn("User repository returned null");
            return List.of();
        }
        
        log.debug("Found {} users", users.size());
        return users.stream()
            .map(UserResponse::from)
            .collect(Collectors.toList());
    }
    
    /**
     * 사용자 생성
     * 
     * @param name 사용자 이름
     * @param email 사용자 이메일
     * @return 생성된 사용자 정보
     */
    @Transactional
    public UserResponse createUser(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("User name cannot be blank");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("User email cannot be blank");
        }
        
        User user = User.builder()
            .name(name)
            .email(email)
            .build();
        
        user = userRepository.save(user);
        log.info("User created: {}", user.getId());
        
        return UserResponse.from(user);
    }
}
