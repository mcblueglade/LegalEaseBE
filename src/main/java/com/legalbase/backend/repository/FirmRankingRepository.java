package com.legalbase.backend.repository;

import com.legalbase.backend.entities.FirmRanking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirmRankingRepository extends JpaRepository<FirmRanking, String> {
}
