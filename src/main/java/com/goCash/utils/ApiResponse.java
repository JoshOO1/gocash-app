package com.goCash.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.http.HttpStatus;

import java.net.http.HttpResponse;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Builder
@ToString
public class ApiResponse <T> {

    private String status;
    private String message;
    private T data;

    @JsonIgnore
    private HttpStatus httpStatus;



    public ApiResponse(String status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ApiResponse(String status, String message, HttpStatus httpStatus) {
        this.status = status;
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
