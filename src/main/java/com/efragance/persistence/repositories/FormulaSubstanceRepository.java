package com.efragance.persistence.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.FormulaSubstance;

/**
 * The Interface FormulaSubstanceRepository.
 */
@Repository
public interface FormulaSubstanceRepository
        extends BaseRepository<FormulaSubstance, Long>, QuerydslPredicateExecutor<FormulaSubstance> {

}
