package com.compass.pb.swplanetsapi.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;


public interface Exception {
    ErrorCode errorCode = null;
    HttpStatus status = null;
}
