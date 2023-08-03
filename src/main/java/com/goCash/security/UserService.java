package com.goCash.security;

import com.goCash.entities.CustomUserDetails;
import com.goCash.entities.User;
import com.goCash.exception.CustomException;
import com.goCash.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserService implements UserDetailsService {
    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("Loading the user details from the database to Spring Security " +
                "During authentication process");

        //Get the user from the database
        User appUser = userRepository.findByEmail(username).orElse(null);
        log.info(username);
        if (appUser == null)
        {
            throw new CustomException("User not in database");
        }
        log.info("User details returned as UserDetails object");
        return new CustomUserDetails(appUser);
    }
}
