package com.efragance.persistence.repositories;

import java.util.Optional;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.Dilution;

/**
 * The Interface DilutionRepository.
 */
@Repository
public interface DilutionRepository extends BaseRepository<Dilution, Long>, QuerydslPredicateExecutor<Dilution> {

    /**
     * Find by name.
     *
     * @param name the name
     * @return the optional
     */
    Optional<Dilution> findByName(String name);

    /**
     * Find by name and id not.
     *
     * @param name       the name
     * @param dilutionId the dilution id
     * @return the optional
     */
    Optional<Dilution> findByNameAndIdNot(String name, Long dilutionId);

}
