package com.goCash.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponse {
    private String userName;
    private String token;
    private final String tokenType = "Bearer";
}
