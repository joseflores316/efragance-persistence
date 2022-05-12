package com.efragance.persistence.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.AttrType;

/**
 * The Interface AttrTypeRepository.
 */
@Repository
public interface AttrTypeRepository extends BaseRepository<AttrType, Long>, QuerydslPredicateExecutor<AttrType> {

}
