package com.efragance.persistence.formula.repositories;

import java.util.Optional;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.RawMaterial;

/**
 * The Interface RawMaterialRepository.
 */
@Repository
public interface RawMaterialRepository
        extends BaseRepository<RawMaterial, Long>, QuerydslPredicateExecutor<RawMaterial> {

    /**
     * Find by name.
     *
     * @param name the name
     * @return the optional
     */
    Optional<RawMaterial> findByName(String name);

    /**
     * Find by name and id not.
     *
     * @param name          the name
     * @param rawMaterialId the raw material id
     * @return the optional
     */
    Optional<RawMaterial> findByNameAndIdNot(String name, Long rawMaterialId);

    /**
     * Find by code
     *
     * @param code the code
     * @return the optional
     */

    Optional<RawMaterial> findByCode(String code);

}
