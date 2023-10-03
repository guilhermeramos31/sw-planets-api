package com.compass.pb.swplanetsapi.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public interface FormatNotAcceptableException extends Exception {
    HttpStatus status = HttpStatus.NOT_ACCEPTABLE;
    default HttpStatus getStatus(){ return status;}
}
