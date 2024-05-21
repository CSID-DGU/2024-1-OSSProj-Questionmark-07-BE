 
package com.example.duel._core.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

// API 응답 대한 유틸리티 클래스
public class ApiUtils {

    public static <T> ApiResult<T> success(HttpStatus httpStatus, T result) {
        return new ApiResult<>(true, httpStatus.value(), httpStatus.getReasonPhrase(), result);
    }

    public static ApiResult<?> error(String message, HttpStatus httpStatus) {
        return new ApiResult<>(false, httpStatus.value(),  message, null);
    }

    @Getter @Setter @AllArgsConstructor

// 해당응답 표현하는 클래스 
    public static class ApiResult<T> {
        private final boolean success;
        private final int code;
        private final String message;
        private final T result;
    }
}
