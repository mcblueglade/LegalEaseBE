package com.legalbase.backend.controllers;

import com.legalbase.backend.model.FirmRankingDto;
import com.legalbase.backend.services.FirmRankingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class FirmRankingControllerTests {

  private static final Integer VALID_REGION_ID = 123;
  private static final Integer INVALID_REGION_ID = 170;
  private static final String VALID_URL = "/api/v1/firm-rankings/find-by-region-id/" + VALID_REGION_ID;
  private static final String INVALID_URL = "/api/v1/firm-rankings/find-by-region-id/" + INVALID_REGION_ID;
  private static final List<FirmRankingDto> firmRankingDtos = new ArrayList<>();

  @InjectMocks
  private FirmRankingController firmRankingController;
  @Mock
  private FirmRankingService firmRankingService;

  private MockMvc mockMvc;
  private HttpHeaders headers = new HttpHeaders();

  @BeforeEach
  void init() {
    mockMvc = MockMvcBuilders.standaloneSetup(firmRankingController).build();
    when(firmRankingService.getFirmRankings()).thenReturn(firmRankingDtos);

  }

  @Test
  void testValidGetFirmRankings() throws Exception {
    this.mockMvc.perform(get(VALID_URL).headers(headers))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().contentType(APPLICATION_JSON_VALUE));
  }

  @Test
  void testInvalidGetFirmRankings() throws Exception {
    this.mockMvc.perform(get(INVALID_URL).headers(headers))
        .andDo(print())
        .andExpect(status().isBadRequest());
  }

  //TODO Add more tests to validate content of response message
}
