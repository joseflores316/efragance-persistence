package com.efragance.persistence.repositories;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.FormulaCompSuggestion;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FormulaCompSuggestionRepository extends BaseRepository<FormulaCompSuggestion, Long>, QuerydslPredicateExecutor<FormulaCompSuggestion> {

    Optional<FormulaCompSuggestion> findByFormulaCompoundRelIdAndMethodTableId(Long formulaCompoundRelId, Long methodTableId);

    Boolean existsByFormulaCompoundRelIdAndMethodTableId(Long formulaCompoundRelId, Long methodTableId);
}
