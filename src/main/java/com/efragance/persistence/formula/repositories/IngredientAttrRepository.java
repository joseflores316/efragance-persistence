package com.efragance.persistence.formula.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.formula.models.IngredientAttr;

/**
 * The Interface IngredientAttrRepository.
 */
@Repository
public interface IngredientAttrRepository
        extends BaseRepository<IngredientAttr, Long>, QuerydslPredicateExecutor<IngredientAttr> {

}
