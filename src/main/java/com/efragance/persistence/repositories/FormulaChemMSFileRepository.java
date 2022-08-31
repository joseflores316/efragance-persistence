package com.efragance.persistence.repositories;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.FormulaChemMsFile;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface FormulaChemMSFileRepository extends BaseRepository<FormulaChemMsFile, Long>, QuerydslPredicateExecutor<FormulaChemMsFile> {
}
