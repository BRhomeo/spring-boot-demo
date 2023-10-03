package com.example.demo.exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiRequestExceptionHandler {

  @ExceptionHandler(value = { ApiRequestException.class })
  public ResponseEntity<ApIException> handleApiRequestException(
    ApiRequestException e
  ) {
    HttpStatus badRequest = HttpStatus.BAD_REQUEST;
    ApIException apIException = new ApIException(
      e.getMessage(),
      e,
      badRequest,
      ZonedDateTime.now(ZoneId.of("Z"))
    );

    return ResponseEntity.status(badRequest).body(apIException);
  }
}
