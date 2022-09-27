package com.efragance.persistence.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.FormulaRel;

/**
 * The Interface FormulaRelRepository.
 */
@Repository
public interface FormulaRelRepository extends BaseRepository<FormulaRel, Long>, QuerydslPredicateExecutor<FormulaRel> {

	Iterable<FormulaRel> findByFormulaIdIn(List<Long> ids);

	Optional<FormulaRel> findByFormulaId(Long id);

	boolean deleteByFormulaId(Long formulaId);

	Optional<FormulaRel> findByFormulaIdAndRelationLevel(Long id, int i);

	void deleteByFormulaIdAndSubFormulaIdAndRelationLevel(Long id, Long ingredientId, int i);

	Optional<FormulaRel> findByFormulaIdAndSubFormulaIdAndRelationLevel(Long formulaId, Long subFormulaId, int level);

	Iterable<FormulaRel> findByFormulaIdInAndRelationLevel(List<Long> ids, int level);

	Iterable<FormulaRel> findAllByFormulaId(Long formulaId);

	void deleteAllByFormulaIdAndFormulaOriginId(Long formulaId, Long subFormulaId);

}
