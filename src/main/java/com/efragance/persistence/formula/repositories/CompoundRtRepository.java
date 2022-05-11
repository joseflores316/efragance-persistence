package com.efragance.persistence.formula.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.formula.models.CompoundRT;

/**
 * The Interface CompoundRtRepository.
 */
@Repository
public interface CompoundRtRepository extends BaseRepository<CompoundRT, Long>, QuerydslPredicateExecutor<CompoundRT> {

}
