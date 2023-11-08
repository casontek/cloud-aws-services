package com.casontek.cloudaws.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class ServiceResponse<T> {
    @Getter
    @Setter
    int code;
    @Getter
    @Setter
    String message;
    @Getter
    @Setter T data;
}
