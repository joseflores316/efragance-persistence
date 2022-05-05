package com.efragance.persistence.formula.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.FormulaFamily;

/**
 * The Interface FormulaFamilyRepository.
 */
public interface FormulaFamilyRepository
        extends BaseRepository<FormulaFamily, Long>, QuerydslPredicateExecutor<FormulaFamily> {

    /**
     * Find by code.
     *
     * @param code the code
     * @return the formula family
     */
    FormulaFamily findByCode(String code);

}
