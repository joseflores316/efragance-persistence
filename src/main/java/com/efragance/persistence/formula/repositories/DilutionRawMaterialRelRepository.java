package com.efragance.persistence.formula.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.formula.models.DilutionRawMaterialRel;

/**
 * The Interface DilutionRawMaterialRelRepository.
 */
@Repository
public interface DilutionRawMaterialRelRepository
        extends BaseRepository<DilutionRawMaterialRel, Long>, QuerydslPredicateExecutor<DilutionRawMaterialRel> {

}
