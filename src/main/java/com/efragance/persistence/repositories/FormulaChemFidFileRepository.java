package com.efragance.persistence.repositories;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import org.springframework.stereotype.Repository;
import com.efragance.persistence.models.FormulaChemFidFile;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

@Repository
public interface FormulaChemFidFileRepository extends BaseRepository<FormulaChemFidFile, Long>, QuerydslPredicateExecutor<FormulaChemFidFile> {

}