package com.example.library.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;

@ControllerAdvice
public class GlobleExceptionHandler {

    @ExceptionHandler(value = RecordNotFoundException.class)
    public ResponseEntity<?> handleRecordNotFoundException(RecordNotFoundException ex) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(
                        new ExceptionResponse(ex.getLocalizedMessage(),
                                false,
                                Arrays.asList(ex.getMessage()),
                                LocalDateTime.now(ZoneId.of("z"))

                        ));
    }
}
