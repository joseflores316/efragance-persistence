package com.efragance.persistence.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.Substance;

/**
 * The Interface SubstanceRepository.
 */
@Repository
public interface SubstanceRepository extends BaseRepository<Substance, Long>, QuerydslPredicateExecutor<Substance> {

}
