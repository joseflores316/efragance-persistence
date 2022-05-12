package com.efragance.persistence.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.FormulaRel;

/**
 * The Interface FormulaRelRepository.
 */
@Repository
public interface FormulaRelRepository extends BaseRepository<FormulaRel, Long>, QuerydslPredicateExecutor<FormulaRel> {

}