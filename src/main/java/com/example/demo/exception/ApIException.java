package com.example.demo.exception;

import java.time.ZonedDateTime;
import org.springframework.http.HttpStatus;

public class ApIException {

  private final String message;
  private final Throwable throwable;
  private final HttpStatus httpStatus;
  private final ZonedDateTime timestamp;

  public ApIException(
    String message,
    Throwable throwable,
    HttpStatus httpStatus,
    ZonedDateTime timestamp
  ) {
    this.message = message;
    this.throwable = throwable;
    this.httpStatus = httpStatus;
    this.timestamp = timestamp;
  }

  public String getMessage() {
    return message;
  }

  public Throwable geThrowable() {
    return throwable;
  }

  public HttpStatus getHttpStatus() {
    return httpStatus;
  }

  public ZonedDateTime getTimestamp() {
    return timestamp;
  }
}
