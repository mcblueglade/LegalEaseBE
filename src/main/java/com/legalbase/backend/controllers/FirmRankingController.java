package com.legalbase.backend.controllers;

import java.util.List;
import com.legalbase.backend.model.FirmRankingDto;
import com.legalbase.backend.services.FirmRankingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Firm Ranking Controller
 */
@Slf4j //TODO add logging
@RestController
@RequestMapping(path = "api/v1/firm-rankings")
public class FirmRankingController {

  @Autowired
  private FirmRankingService firmRankingService;

  @GetMapping(path = "find-by-region-id/{regionId}")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<List<FirmRankingDto>> getFirmRankingsByRegionId(@PathVariable("regionId") Integer regionId) {

    if(regionId == 170) {
      //TODO Add error message to response
      return ResponseEntity.badRequest().build();
    }

    return ResponseEntity.ok(firmRankingService.getFirmRankings());
  }
}
