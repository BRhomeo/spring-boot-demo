package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
// Request logic as following:
//? Request Fields(Deal Unique Id, From Currency ISO Code "Ordering Currency", To Currency ISO Code, Deal timestamp, Deal Amount in ordering currency).
//? Validate row structure.(e.g: Missing fields, Type format..etc. We do not expect you to cover all possible cases but we'll look to how you'll implement validations)
//@  No rollback allowed, what every rows imported should be saved in DB.
//! System should not import same request twice.
// Deliverables should be ready to work including:
//? Use Actual Db, you can select between (Postgres, MySql or MongoDB)
//? Maven or Gradle project is required for full source code.
//? Proper Logging.
//? Proper documentation using md.
//@ Proper error/exception handling.
//@ Workable deployment including sample file (Docker Compose).
// Delivered over Githhub.com.
// Proper unit testing with respected Coverage.
// Makefile to streamline running application (plus).
