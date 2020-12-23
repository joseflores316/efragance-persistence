package com.efragance.persistence.formula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.efragance.persistence.formula.models.FormulaLevelRawMaterialView;

/**
 * The Interface FormulaLevelRawMaterialViewRepository.
 */
public interface FormulaLevelRawMaterialViewRepository extends JpaRepository<FormulaLevelRawMaterialView, Long>,
        QuerydslPredicateExecutor<FormulaLevelRawMaterialView> {

}
