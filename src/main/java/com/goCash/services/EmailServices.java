package com.goCash.services;


import com.goCash.dto.request.EmailDto;
import org.springframework.stereotype.Component;

@Component
public interface EmailService {

    void sendMessage(EmailDto data);
}
