package com.efragance.persistence.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.Annexed;

/**
 * The Interface AnnexedRepository.
 */
@Repository
public interface AnnexedRepository extends BaseRepository<Annexed, Long>, QuerydslPredicateExecutor<Annexed> {

}
