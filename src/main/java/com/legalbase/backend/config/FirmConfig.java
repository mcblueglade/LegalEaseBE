package com.legalbase.backend.config;

import com.legalbase.backend.entities.Badge;
import com.legalbase.backend.entities.Firm;
import com.legalbase.backend.repository.FirmRepository;
import java.util.List;
import java.util.Set;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Firm Configuration
 */
@Configuration
public class FirmConfig {
  @Bean
  CommandLineRunner firmCommandLineRunner(FirmRepository firmRepository) {

    return args -> {

      Badge badge8 = new Badge("8","Top 10 worldwide","top-10-worldwide-8");
      Badge badge9 = new Badge("9","Top 50 worldwide","top-50-worldwide-9");

      List<Firm> all = firmRepository.findAll();
      all.stream().forEach(f -> {
        switch (f.getFirmId()) {
          case "960":
          case "6339":
          case "13185":
          case "13837":
            f.setBadges(Set.of(badge8, badge9));
            break;
          case "11229":
            f.setBadges(Set.of(badge8));
            break;
          case "15630":
            f.setBadges(Set.of(badge9));
            break;
        }
      });

      if(!all.isEmpty()) {
        firmRepository.saveAll(all);
      }
    };
  }
}
