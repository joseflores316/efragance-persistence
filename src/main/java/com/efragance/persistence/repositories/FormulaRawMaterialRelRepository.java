package com.efragance.persistence.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.Formula;
import com.efragance.persistence.models.FormulaRawMaterialRel;

/**
 * The Interface FormulaRawMaterialRelRepository.
 */
@Repository
public interface FormulaRawMaterialRelRepository
        extends BaseRepository<FormulaRawMaterialRel, Long>, QuerydslPredicateExecutor<FormulaRawMaterialRel> {

    Optional<FormulaRawMaterialRel> findByFormulaIdAndRawMaterialId(long formulaId, long rawMaterialId);

    long countByFormulaIdAndRawMaterialId(long formulaId, long rawMaterialId);

	Iterable<FormulaRawMaterialRel> findByFormulaIdIn(List<Long> list);
}
