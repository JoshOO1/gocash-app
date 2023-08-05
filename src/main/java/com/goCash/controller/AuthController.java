package com.goCash.controller;

import com.goCash.dto.request.LoginRequest;
import com.goCash.dto.request.UserRegistrationRequest;
import com.goCash.dto.response.LoginResponse;
import com.goCash.services.UserService;
import com.goCash.utils.ApiResponse;
import com.goCash.utils.validations.PasswordValidator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final UserService appUserService;
    private final PasswordValidator passwordValidator;



    @PostMapping(path = "/register")
    public ResponseEntity<ApiResponse<?>> registerUser(@RequestBody @Valid UserRegistrationRequest request) {
        log.info("controller register: register user :: [{}] ::", request.getEmail());
        passwordValidator.isValid(request);
        ApiResponse<String> response = appUserService.registerUser(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @PostMapping(path = "/login")
    public ResponseEntity<ApiResponse<LoginResponse>> loginUser(@RequestBody @Valid LoginRequest request) {
        log.info("request to login user");
        ApiResponse<LoginResponse> response = appUserService.login(request);
        return ResponseEntity.status(response.getHttpStatus()).body(response);
    }

}