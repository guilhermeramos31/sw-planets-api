package com.compass.pb.swplanetsapi.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class TerrainFormatNotAcceptableException extends RuntimeException implements FormatNotAcceptableException {
    private final ErrorCode errorCode;
    private final HttpStatus status;

    public TerrainFormatNotAcceptableException(ErrorCode errorCode, HttpStatus status) {
        super(ErrorCode.NOT_ACCEPTABLE.name());
        this.errorCode = errorCode;
        this.status = status;
    }
}
