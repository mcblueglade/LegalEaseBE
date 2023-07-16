package com.legalbase.backend.services;

import com.legalbase.backend.entities.Award;
import com.legalbase.backend.entities.Badge;
import com.legalbase.backend.entities.Firm;
import com.legalbase.backend.entities.FirmRanking;
import com.legalbase.backend.entities.FirmRegion;
import com.legalbase.backend.entities.Region;
import com.legalbase.backend.entities.RegionArea;
import com.legalbase.backend.entities.RegionGroup;
import com.legalbase.backend.model.AwardDto;
import com.legalbase.backend.model.BadgeDto;
import com.legalbase.backend.model.FirmDto;
import com.legalbase.backend.model.FirmRankingDto;
import com.legalbase.backend.model.FirmRegionDto;
import com.legalbase.backend.model.RegionAreaDto;
import com.legalbase.backend.model.RegionDto;
import com.legalbase.backend.model.RegionGroupDto;
import com.legalbase.backend.repository.FirmRankingRepository;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.util.Objects.nonNull;

/**
 * Firm Ranking Service
 */
@Slf4j //TODO add logging
@Service
public class FirmRankingService {

  @Autowired
  private FirmRankingRepository firmRankingRepository;

  @Autowired
  private ModelMapper modelMapper;

  public List<FirmRankingDto> getFirmRankings() {
    List<FirmRanking> all = firmRankingRepository.findAll();
    List<FirmRankingDto> firmRankingDtos = toFirmRankingDtos(all);
    return firmRankingDtos;
  }

  private List<FirmRankingDto> toFirmRankingDtos(List<FirmRanking> firmRankings) {
    List<FirmRankingDto> firmRankingDtos = new ArrayList<>();

    for (FirmRanking firmRanking: firmRankings) {

      Firm firm = firmRanking.getFirm();
      Set<Award> awards = firm.getAwards();
      Set<Badge> badges = firm.getBadges();
      Set<FirmRegion> firmRegions = firm.getFirmRegions();

      FirmRankingDto firmRankingDto = FirmRankingDto.builder()
          .id(firmRanking.getFirmRankingId())
          .trend(firmRanking.getTrend())
          .diversity(firmRanking.isDiversity())
          .tier(firmRanking.getTier())
          .position(firmRanking.getPosition())
          .build();

      FirmDto firmDto = FirmDto.builder()
          .id(firm.getFirmId())
          .name(firm.getName())
          .slug(firm.getSlug())
          .imageUrl(firm.getImageUrl())
          .websiteUrl(firm.getWebsiteUrl())
          .build();

      //TODO Move mapping to a separate function
      if (nonNull(awards) && !awards.isEmpty()) {
        Set<AwardDto> awardDtos
            = awards.stream()
            .map(a -> modelMapper.map(a, AwardDto.class))
            .collect(Collectors.toSet());
        firmDto.setAwards(awardDtos);
      } else {
        firmDto.setAwards(new HashSet<>());
      }

      //TODO Move mapping to a separate function
      if (nonNull(badges) && !badges.isEmpty()) {
        Set<BadgeDto> badgeDtos
            = badges.stream()
            .map(a -> {
              BadgeDto bDto = modelMapper.map(a, BadgeDto.class);
              bDto.setId(a.getBadgeId());
              return bDto;
            })
            .collect(Collectors.toSet());

        firmDto.setBadges(badgeDtos);
      } else {
        firmDto.setBadges(new HashSet<>());
      }


      if (nonNull(firmRegions) && !firmRegions.isEmpty()) {
        Set<FirmRegionDto> firmRegionDtos = firmRegions.stream()
            .map(this::mapFirmRegion)
            .collect(Collectors.toSet());
        firmDto.setFirmRegions(firmRegionDtos);
      } else {
        firmDto.setFirmRegions(new HashSet<>());
      }

      firmRankingDto.setFirm(firmDto);
      firmRankingDtos.add(firmRankingDto);
    }

    return firmRankingDtos;
  }

  private FirmRegionDto mapFirmRegion(FirmRegion firmRegion) {
    FirmRegionDto frDto = modelMapper.map(firmRegion, FirmRegionDto.class);
    frDto.setId(firmRegion.getFirmRegionId());

    Region region = firmRegion.getRegion();
    RegionGroup regionGroup = region.getRegionGroup();
    RegionArea regionArea = regionGroup.getRegionArea();

    RegionDto regionDto = modelMapper.map(region, RegionDto.class);
    RegionGroupDto regionGroupDto = modelMapper.map(regionGroup, RegionGroupDto.class);

    RegionAreaDto regionAreaDto = modelMapper.map(regionArea, RegionAreaDto.class);
    regionGroupDto.setRegionArea(regionAreaDto);

    regionDto.setRegionGroup(regionGroupDto);
    return frDto;
  }
}
