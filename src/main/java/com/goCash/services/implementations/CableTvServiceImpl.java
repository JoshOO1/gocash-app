package com.goCash.services.implementations;

import com.goCash.services.CableTvService;
import com.goCash.utils.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;


@Service
@Slf4j
@RequiredArgsConstructor
public class CableTvServiceImpl implements CableTvService {

    private final RestTemplate restTemplate = new RestTemplate();
    @Override
    public ApiResponse<List<Object>> getTvProviderBouquets(String provider) {
        String uri = "https://api-service.vtpass.com/api/service-variations?serviceID=" + provider;
        log.info("get details from VtPass api");

        Object[] objects = new Object[]{restTemplate.getForObject(
                uri,
                Object.class)};

        return ApiResponse.<List<Object>>builder()
                .code("00")
                .message("successful")
                .data(Arrays.stream(objects).toList())
                .httpStatus(HttpStatus.ACCEPTED)
                .build();
    }
}
