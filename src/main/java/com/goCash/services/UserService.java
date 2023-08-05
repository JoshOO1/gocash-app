package com.goCash.services;

import com.goCash.dto.request.LoginRequest;
import com.goCash.dto.request.UserRegistrationRequest;
import com.goCash.utils.ApiResponse;

public interface UserService {

    ApiResponse login(LoginRequest loginDTO);
    ApiResponse<String> registerUser(UserRegistrationRequest request);


}
