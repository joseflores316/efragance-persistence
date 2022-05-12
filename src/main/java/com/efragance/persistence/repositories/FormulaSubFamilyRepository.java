package com.efragance.persistence.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.FormulaSubFamily;

/**
 * The Interface FormulaSubFamilyRepository.
 */
public interface FormulaSubFamilyRepository
        extends BaseRepository<FormulaSubFamily, Long>, QuerydslPredicateExecutor<FormulaSubFamily> {

}
