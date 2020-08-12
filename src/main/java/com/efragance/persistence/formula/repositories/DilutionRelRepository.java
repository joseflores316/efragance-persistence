package com.efragance.persistence.formula.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.formula.models.DilutionRel;

/**
 * The Interface DilutionRelRepository.
 */
@Repository
public interface DilutionRelRepository
        extends BaseRepository<DilutionRel, Long>, QuerydslPredicateExecutor<DilutionRel> {

}
