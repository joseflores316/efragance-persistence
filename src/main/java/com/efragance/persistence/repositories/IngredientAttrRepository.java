package com.efragance.persistence.repositories;

import java.util.Optional;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.IngredientAttr;

/**
 * The Interface IngredientAttrRepository.
 */
@Repository
public interface IngredientAttrRepository
        extends BaseRepository<IngredientAttr, Long>, QuerydslPredicateExecutor<IngredientAttr> {

    Optional<IngredientAttr> findByAttrTypeId(Long attrTypeId);

    Optional<IngredientAttr> findByIngredientIdAndAttrTypeId(Long ingredientId, Long attrTypeId);

    IngredientAttr findByIngredientId(Long ingredientId);
}
