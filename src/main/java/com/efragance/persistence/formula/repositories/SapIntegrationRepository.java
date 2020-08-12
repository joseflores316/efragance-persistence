package com.efragance.persistence.formula.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.formula.models.SapIntegration;

/**
 * The Interface SapIntegrationRepository.
 */
@Repository
public interface SapIntegrationRepository
        extends BaseRepository<SapIntegration, Long>, QuerydslPredicateExecutor<SapIntegration> {

}
