package com.efragance.persistence.repositories;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import org.springframework.stereotype.Repository;
import com.efragance.persistence.models.FormulaChemFidFile;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface FormulaChemFidFileRepository extends BaseRepository<FormulaChemFidFile, Long>, QuerydslPredicateExecutor<FormulaChemFidFile> {

    List<FormulaChemFidFile> findByFormulaIdAndRtBetween(Long formulaId, BigDecimal before , BigDecimal after);

}
