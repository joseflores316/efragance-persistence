package com.efragance.persistence.formula.repositories;

import java.util.Optional;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.DilutionRawMaterialRel;

/**
 * The Interface DilutionRawMaterialRelRepository.
 */
@Repository
public interface DilutionRawMaterialRelRepository
        extends BaseRepository<DilutionRawMaterialRel, Long>, QuerydslPredicateExecutor<DilutionRawMaterialRel> {

    long countByDilutionIdAndRawMaterialId(long dilutionId, long rawMaterialId);

    Optional<DilutionRawMaterialRel> findByDilutionIdAndRawMaterialId(long dilutionId, long rawMaterialId);
}
