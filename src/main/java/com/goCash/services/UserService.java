package com.goCash.services;

import com.goCash.dto.request.LoginRequest;
import com.goCash.utils.ApiResponse;

public interface UserService {

    ApiResponse login(LoginRequest loginDTO);


}
