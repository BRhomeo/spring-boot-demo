package com.example.demo.controller;

import com.example.demo.model.Deal;
import com.example.demo.repo.DealRepo;
import jakarta.validation.Valid;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DealController {

  Logger logger = LoggerFactory.getLogger(DealController.class);

  @Autowired
  DealRepo dealRepo;

  @PostMapping("/add-deal")
  ResponseEntity<Deal> createDeal(@Valid @RequestBody Deal deal) {
    Deal savedDeal;
    try {
      deal.setTimestamp(
        new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
      );
      // to remove ID from the request
      deal.setId(0);
      savedDeal = dealRepo.save(deal);
      logger.info("Deal saved successfully");
    } catch (Exception e) {
      logger.error("Error while saving deal", e);
      return ResponseEntity.badRequest().body(deal);
    }
    return ResponseEntity.ok(savedDeal);
  }
}
