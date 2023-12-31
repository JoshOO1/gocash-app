package com.goCash.controller;

import com.goCash.services.implementations.UserServiceImp;
import com.goCash.utils.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {
    private final UserServiceImp appUserService;


    @GetMapping("/user")
    public ResponseEntity<ApiResponse> viewUser(){
        log.info("call the userservice to view user profiles");
        ApiResponse apiResponse = appUserService.getUser();
        return new ResponseEntity<>(apiResponse, HttpStatus.ACCEPTED);
    }
}
