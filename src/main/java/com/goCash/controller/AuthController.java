package com.goCash.controller;

import com.goCash.dto.request.LoginRequest;
import com.goCash.exception.CustomException;
import com.goCash.service.IUserService;
import com.goCash.utils.ApiResponse;
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

    private final IUserService appUserService;


    @PostMapping(path = "/login")
    public ResponseEntity<?> loginUser(@RequestBody @Valid LoginRequest request) {
        log.info("request to login user");
        var response = appUserService.login(request);
        return ResponseEntity.status(200).body(response);

    }

}