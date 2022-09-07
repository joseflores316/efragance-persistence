package com.efragance.persistence.repositories;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.FormulaAmdisFile;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface FormulaAmdisFileRepository extends BaseRepository<FormulaAmdisFile, Long>, QuerydslPredicateExecutor<FormulaAmdisFile> {
}
