package com.compass.pb.swplanetsapi.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class PlanetNotFoundException extends RuntimeException{
    private final ErrorCode errorCode;
    private final HttpStatus status;

    public PlanetNotFoundException(){
        super(ErrorCode.NOT_FOUND.name());
        this.errorCode = ErrorCode.NOT_FOUND;
        this.status = HttpStatus.NOT_FOUND;
    }
}
