package com.goCash.utils.validations;

import com.goCash.dto.request.UserRegistrationRequest;
import com.goCash.exception.PassWordMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class PasswordValidator {
    public Boolean isValid(UserRegistrationRequest userRegistrationRequestDto) {
        String password = userRegistrationRequestDto.getPassword();
        String confirmpassword = userRegistrationRequestDto.getConfirmPassword();

        if (Objects.equals(password, confirmpassword)) {
            return true;
        } else {
            throw new PassWordMatcher("password do not match", HttpStatus.BAD_REQUEST);
        }
    }
}
