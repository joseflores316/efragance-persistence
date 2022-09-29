package com.efragance.persistence.repositories;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.FormulaCompArea;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FormulaCompAreaRepository extends BaseRepository<FormulaCompArea, Long>, QuerydslPredicateExecutor<FormulaCompArea> {

    Optional<FormulaCompArea> findByFormulaCompoundRelIdAndMethodTableIdAndOriginal(Long formulaCompoundRelId, Long methodTableId, Boolean original);

    Boolean existsByFormulaCompoundRelIdAndMethodTableIdAndOriginal(Long formulaCompoundRelId, Long methodTableId, Boolean original);

}
