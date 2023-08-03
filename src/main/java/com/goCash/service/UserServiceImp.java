package com.goCash.service;

import com.goCash.dto.request.LoginRequest;
import com.goCash.dto.response.LoginResponse;
import com.goCash.entities.User;
import com.goCash.exception.CustomException;
import com.goCash.repository.UserRepository;
import com.goCash.security.JwtService;
import com.goCash.utils.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImp implements IUserService{
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    @Override
    public ApiResponse login(LoginRequest loginDTO) {
        log.info("Request to login at the service layer");

        Authentication authenticationUser;
        try {
            authenticationUser = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginDTO.getEmail(), loginDTO.getPassword())
            );
            log.info("Authenticated the User by the Authentication manager");
        } catch (DisabledException es) {
            throw new CustomException("Disabled exception " + es.getMessage());
        } catch (BadCredentialsException e) {
            throw new CustomException("BadException " + e.getMessage());
        }

        // Tell securityContext that this user is in the context
        SecurityContextHolder.getContext().setAuthentication(authenticationUser);

        // Retrieve the user from the repository
        User appUser = userRepository.findByEmail(loginDTO.getEmail()).orElseThrow(() ->
                new CustomException("User not found"));

        // Update the lastLoginDate field
        appUser.setLastLoginDate(LocalDateTime.now());

        // Save the updated user entity
        userRepository.save(appUser);

        // Generate and send token
        String tokenGenerated = "Bearer " + jwtService.generateToken(authenticationUser);
        log.info("Jwt token generated for the user");
        LoginResponse loginResponse = LoginResponse.builder().token(tokenGenerated)
                .userName(loginDTO.getEmail()).build();

        return ApiResponse.builder().message("Successfully logged in").data(loginResponse)
                .status(true).httpStatus(HttpStatus.OK).build();
    }



}
