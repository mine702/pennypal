package com.ssafy.pennypal.stock.exception;

import com.ssafy.pennypal.global.common.api.ApiResponse;
import com.ssafy.pennypal.stock.controller.StockController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(assignableTypes = StockController.class)
public class StockExceptionHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(Exception.class)
    public ApiResponse<Object> bindException(Exception e) {
        return ApiResponse.of(
                HttpStatus.BAD_REQUEST,
                e.getMessage(), null
        );
    }
}
