package com.efragance.persistence.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.BaseAppl;

/**
 * The Interface BaseApplRepository .
 */
@Repository
public interface BaseApplRepository extends BaseRepository<BaseAppl, Long>, QuerydslPredicateExecutor<BaseAppl> {

}
