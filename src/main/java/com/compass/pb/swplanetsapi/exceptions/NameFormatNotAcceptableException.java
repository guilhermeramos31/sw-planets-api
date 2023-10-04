package com.compass.pb.swplanetsapi.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class NameFormatNotAcceptableException extends RuntimeException implements FormatNotAcceptableException{
    private final ErrorCode errorCode;
    private final HttpStatus status;
    public NameFormatNotAcceptableException() {
        super(ErrorCode.NOT_ACCEPTABLE.name());
        this.errorCode = ErrorCode.NOT_ACCEPTABLE;
        this.status = HttpStatus.NOT_ACCEPTABLE;
    }
}
