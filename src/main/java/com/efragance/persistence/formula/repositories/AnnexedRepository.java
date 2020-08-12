package com.efragance.persistence.formula.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.formula.models.Annexed;

/**
 * The Interface AnnexedRepository.
 */
@Repository
public interface AnnexedRepository extends BaseRepository<Annexed, Long>, QuerydslPredicateExecutor<Annexed> {

}
