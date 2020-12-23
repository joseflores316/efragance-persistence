package com.efragance.persistence.formula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.efragance.persistence.formula.models.FormulaLevelSubFormulaDilutionRelView;

/**
 * The Interface FormulaLevelSubFormulaDilutionRelViewRepository.
 */
public interface FormulaLevelSubFormulaDilutionRelViewRepository
        extends JpaRepository<FormulaLevelSubFormulaDilutionRelView, Long>,
        QuerydslPredicateExecutor<FormulaLevelSubFormulaDilutionRelView> {

}
