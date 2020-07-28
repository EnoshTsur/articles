package com.enosh.articles.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;


@Getter
@Setter
@ToString
public class ResponseDto<T> {

    private LocalDate date;
    private LocalTime time;
    private boolean success;
    private T content;

    private ResponseDto(boolean success, T content) {
        this.date = LocalDate.now();
        this.time = LocalTime.now();
        this.success = success;
        this.content = content;
    }

    public static <T> ResponseDto<T> of(boolean success, T content) {
        return new ResponseDto<>(success, content);
    }

    public static <T> ResponseDto<T> success(T content) {
        return of(true, content);
    }

    public static <T> ResponseDto<T> failure(T content) {
        return of(false, content);
    }
}


