package com.efragance.persistence.repositories;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.FormulaAmdisFile;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface FormulaAmdisFileRepository extends BaseRepository<FormulaAmdisFile, Long>, QuerydslPredicateExecutor<FormulaAmdisFile> {

	Optional<FormulaAmdisFile> findByFormulaIdAndMethodTableIdAndLibraryIdAndRt(Long formulaId, Long methodTableId, Long libraryId, BigDecimal rt);
	
}
