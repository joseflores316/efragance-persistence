package com.efragance.persistence.repositories;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import org.springframework.stereotype.Repository;
import com.efragance.persistence.models.FormulaChemFidFile;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;

@Repository
public interface FormulaChemFidFileRepository extends BaseRepository<FormulaChemFidFile, Long>, QuerydslPredicateExecutor<FormulaChemFidFile> {

	Optional<FormulaChemFidFile> findByFormulaIdAndMethodTableIdAndRt(Long formulaId, Long methodTableId, BigDecimal stringToBigDecimal);

    List<FormulaChemFidFile> findByFormulaIdAndRtBetween(Long formulaId, BigDecimal before , BigDecimal after);

}
