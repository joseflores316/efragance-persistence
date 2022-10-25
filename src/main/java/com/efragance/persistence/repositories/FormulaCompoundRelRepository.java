package com.efragance.persistence.repositories;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.FormulaCompoundRel;

import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FormulaCompoundRelRepository extends BaseRepository<FormulaCompoundRel, Long>, QuerydslPredicateExecutor<FormulaCompoundRel> {
	
	List<FormulaCompoundRel> findByFormulaId(Long formulaId, Pageable pageable);

    List<FormulaCompoundRel> findByFormulaIdAndCompoundId(Long formulaId, Long compoundId);

    Optional<FormulaCompoundRel> findById(Long id);

	long countByFormulaId(Long formulaId);

}
