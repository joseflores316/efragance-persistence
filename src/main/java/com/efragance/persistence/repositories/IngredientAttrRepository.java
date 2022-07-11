package com.efragance.persistence.repositories;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.IngredientAttr;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * The Interface IngredientAttrRepository.
 */
@Repository
public interface IngredientAttrRepository
        extends BaseRepository<IngredientAttr, Long>, QuerydslPredicateExecutor<IngredientAttr> {

    List<Optional<IngredientAttr>> findByAttrTypeId(Long attrTypeId);

    Optional<IngredientAttr> findByIngredientIdAndAttrTypeId(Long ingredientId, Long attrTypeId);

    List<IngredientAttr> findByIngredientId(Long ingredientId);

    boolean existsByAttrTypeId(Long attrTypeId);

}
