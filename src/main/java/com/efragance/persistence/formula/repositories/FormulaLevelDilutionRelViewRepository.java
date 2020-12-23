package com.efragance.persistence.formula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.efragance.persistence.formula.models.FormulaLevelDilutionRelView;

/**
 * The Interface FormulaLevelDilutionRelViewRepository.
 */
public interface FormulaLevelDilutionRelViewRepository extends JpaRepository<FormulaLevelDilutionRelView, Long>,
        QuerydslPredicateExecutor<FormulaLevelDilutionRelView> {

}
