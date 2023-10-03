package com.compass.pb.swplanetsapi.exceptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public class Problem {

    @JsonProperty("Code")
    private final int code;

    @JsonProperty("Status")
    private final String status;

    @JsonProperty("Message")
    private final String message;

    public Problem(ErrorCode errorCode, PlanetNotFoundException exception){
        this.code = exception.getStatus().value();
        this.status = errorCode.name();
        this.message = errorCode.getMessage();
    }
    public Problem(ErrorCode errorCode, FormatNotAcceptableException exception){
        this.code = exception.getStatus().value();
        this.status = errorCode.name();
        this.message = errorCode.getMessage();
    }
}