package com.example.demo.controller;

import com.example.demo.exception.ApiRequestException;
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
      // TODO: System should not import same request twice. (we could add request ID)
      savedDeal = dealRepo.save(cleanRequistData(deal));
      logger.info("Deal saved successfully");
    } catch (Exception e) {
      logger.error("Error while saving deal", e);
      throw new ApiRequestException("Error while saving deal");
    }
    return ResponseEntity.ok(savedDeal);
  }

  private Deal cleanRequistData(Deal deal) {
    deal.setId(0);
    deal.setTimestamp(
      new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
    );
    return deal;
  }
}
