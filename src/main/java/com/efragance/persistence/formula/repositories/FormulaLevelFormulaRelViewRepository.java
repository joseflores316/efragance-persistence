package com.efragance.persistence.formula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.efragance.persistence.formula.models.FormulaLevelFormulaRelView;

/**
 * The Interface FormulaLevelFormulaRelViewRepository.
 */
public interface FormulaLevelFormulaRelViewRepository
        extends JpaRepository<FormulaLevelFormulaRelView, Long>, QuerydslPredicateExecutor<FormulaLevelFormulaRelView> {

}
