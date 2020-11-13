package com.efragance.persistence.formula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.persistence.formula.models.FormulaRawMaterialRel;

/**
 * The Interface FormulaRawMaterialViewRepository.
 */
@Repository
public interface FormulaMapViewRepository
        extends JpaRepository<FormulaRawMaterialRel, Long>, QuerydslPredicateExecutor<FormulaRawMaterialRel> {

}
