package com.goCash.services;

import com.goCash.dto.request.CreateWalletRequest;
import com.goCash.dto.request.UserRegistrationRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Service
@Slf4j
@RequiredArgsConstructor
public class FlutterWaveService {
    private final RestTemplate restTemplate;

    @Value("${flutterwave.authkey}")
    private String fluttertoken;

    public ResponseEntity<String> createVirtualAcccount(UserRegistrationRequest request) {
        log.info("method that calls the flutterwave api");
        CreateWalletRequest walletRequestrequest = CreateWalletRequest.builder()
                .firstname(request.getFirstName())
                .lastname(request.getLastName())
                .email(request.getEmail())
                .bvn(request.getBvn())
                .phonenumber(request.getPhoneNumber())
                .is_permanent(true)
                .tx_ref("GOC"+ LocalDateTime.now())
                .amount(1)
                .build();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", fluttertoken);
        log.info("Calling the api now");

        ResponseEntity<String> exchange = restTemplate.exchange(
                "https://api.flutterwave.com/v3/virtual-account-numbers",
                HttpMethod.POST,
                new HttpEntity<>(walletRequestrequest, headers),
                String.class


        );
        log.info(String.valueOf(exchange));
        return exchange;
    }
}
