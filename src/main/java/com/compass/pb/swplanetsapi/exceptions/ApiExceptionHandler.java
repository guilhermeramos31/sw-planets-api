package com.compass.pb.swplanetsapi.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(PlanetNotFoundException.class)
    public final ResponseEntity<Object> handlerPlanetNotFound(PlanetNotFoundException e){
        var problem = new Problem(e.getErrorCode(),e);
        return ResponseEntity.status(e.getStatus()).body(problem);
    }
    @ExceptionHandler({ClimateFormatNotAcceptableException.class, })
    public final ResponseEntity<Object> handlerClimateFormatNotAcceptable(ClimateFormatNotAcceptableException e){
        var problem = new Problem(e.getErrorCode(),e);
        return ResponseEntity.status(e.getStatus()).body(problem);
    }
    @ExceptionHandler(NameFormatNotAcceptableException.class)
    public final ResponseEntity<Object> handlerNameFormatNotAcceptable(NameFormatNotAcceptableException e){
        var problem = new Problem(e.getErrorCode(),e);
        return ResponseEntity.status(e.getStatus()).body(problem);
    }
    @ExceptionHandler(TerrainFormatNotAcceptableException.class)
    public final ResponseEntity<Object> handlerTerrainFormatNotAcceptable(TerrainFormatNotAcceptableException e){
        var problem = new Problem(e.getErrorCode(),e);
        return ResponseEntity.status(e.getStatus()).body(problem);
    }
}
