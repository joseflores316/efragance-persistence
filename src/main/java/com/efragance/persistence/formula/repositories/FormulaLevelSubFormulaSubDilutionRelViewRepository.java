package com.efragance.persistence.formula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.efragance.persistence.formula.models.FormulaLevelSubFormulaSubDilutionRelView;

/**
 * The Interface FormulaLevelSubFormulaSubDilutionRelViewRepository.
 */
public interface FormulaLevelSubFormulaSubDilutionRelViewRepository
        extends JpaRepository<FormulaLevelSubFormulaSubDilutionRelView, Long>,
        QuerydslPredicateExecutor<FormulaLevelSubFormulaSubDilutionRelView> {

}
