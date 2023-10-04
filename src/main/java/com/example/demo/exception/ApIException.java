package com.example.demo.exception;

import java.time.ZonedDateTime;
import org.springframework.http.HttpStatus;

public class ApIException {

  private final String message;
  private final HttpStatus httpStatus;
  private final ZonedDateTime timestamp;

  public ApIException(
    String message,
    HttpStatus httpStatus,
    ZonedDateTime timestamp
  ) {
    this.message = message;
    this.httpStatus = httpStatus;
    this.timestamp = timestamp;
  }

}
