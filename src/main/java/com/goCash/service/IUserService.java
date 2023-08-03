package com.goCash.service;

import com.goCash.dto.request.LoginRequest;
import com.goCash.utils.ApiResponse;

public interface IUserService {

    ApiResponse login(LoginRequest loginDTO);


}
