package com.efragance.persistence.repositories;

import java.util.Optional;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.IngredientCompoundRel;

/**
 * The Interface IngredientCompoundRelRepository
 */
@Repository
public interface IngredientCompoundRelRepository
        extends BaseRepository<IngredientCompoundRel, Long>, QuerydslPredicateExecutor<IngredientCompoundRel> {

    Optional<IngredientCompoundRel> findByCompoundId(final Long id);

}
