package com.efragance.persistence.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.Compound;

/**
 * The Interface CompoundRepository
 */
@Repository
public interface CompoundRepository extends BaseRepository<Compound, Long>, QuerydslPredicateExecutor<Compound> {

}
