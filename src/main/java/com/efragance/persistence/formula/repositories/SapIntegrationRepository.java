package com.efragance.persistence.formula.repositories;

import java.util.Optional;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.SapIntegration;

/**
 * The Interface SapIntegrationRepository.
 */
@Repository
public interface SapIntegrationRepository
        extends BaseRepository<SapIntegration, Long>, QuerydslPredicateExecutor<SapIntegration> {

    /**
     * Find by formula id.
     *
     * @param formulaId the formula id
     * @return the optional
     */
    Optional<SapIntegration> findByFormulaId(Long formulaId);

}
