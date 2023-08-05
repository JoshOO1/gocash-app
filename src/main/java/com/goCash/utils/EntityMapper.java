package com.goCash.utils;

import com.goCash.dto.request.UserRegistrationRequest;
import com.goCash.entities.User;
import com.goCash.enums.Roles;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class EntityMapper {
    public User dtoToUser(UserRegistrationRequest request) {
        return User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .password(request.getPassword())
                .email(request.getEmail())
                .phoneNumber(request.getPhoneNumber())
                .gender(request.getGender())
                .address(request.getAddress())
                .dateOfBirth(request.getDateOfBirth())
                .registrationDate(LocalDateTime.now())
                .role(Roles.USER)
                .build();
    }
}
