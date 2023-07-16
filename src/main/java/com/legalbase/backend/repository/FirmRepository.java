package com.legalbase.backend.repository;

import com.legalbase.backend.entities.Firm;
import com.legalbase.backend.entities.RegionArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirmRepository extends JpaRepository<Firm, String> {
}
