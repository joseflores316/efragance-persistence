package com.efragance.persistence.formula.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.formula.models.FormulaFamily;

/**
 * The Interface FormulaFamilyRepository.
 */
public interface FormulaFamilyRepository
        extends BaseRepository<FormulaFamily, Long>, QuerydslPredicateExecutor<FormulaFamily> {

}
