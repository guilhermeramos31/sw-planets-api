package com.compass.pb.swplanetsapi.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    NOT_FOUND("Data Not Found"),

    BAD_REQUEST("Invalid Data"),

    SYSTEM_ERROR("Unavailable Server"),

    NOT_ACCEPTABLE("Format not acceptable");

    private final String message;
}