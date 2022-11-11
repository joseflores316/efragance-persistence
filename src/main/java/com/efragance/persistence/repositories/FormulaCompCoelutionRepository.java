package com.efragance.persistence.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.FormulaCompCoelution;

@Repository
public interface FormulaCompCoelutionRepository extends BaseRepository<FormulaCompCoelution, Long>, QuerydslPredicateExecutor<FormulaCompCoelution> {

	List<FormulaCompCoelution> findByFormulaCompAreaId(Long id);

	List<FormulaCompCoelution> findByCoelutionId(Long coelutionId);

	Optional<FormulaCompCoelution> findByCoelutionIdAndFormulaCompAreaId(Long coelutionId, Long formulaCompAreaId);

}
