package com.efragance.persistence.formula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.efragance.persistence.formula.models.FormulaLevelDilutionView;

/**
 * The Interface FormulaLevelDilutionViewRepository.
 */
public interface FormulaLevelDilutionViewRepository
        extends JpaRepository<FormulaLevelDilutionView, Long>, QuerydslPredicateExecutor<FormulaLevelDilutionView> {

}
