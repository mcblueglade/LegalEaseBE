package com.legalbase.backend.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Utility to Map POJOs Configuration
 */
@Configuration
public class ModelMapperConfig {
  @Bean
  public ModelMapper modelMapper() {
    return new ModelMapper();
  }
}
