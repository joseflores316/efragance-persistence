package com.efragance.persistence.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.IngredientCompoundRel;
import com.efragance.persistence.models.Method;

@Repository
public interface IngredientCompoundRelRepository
        extends BaseRepository<IngredientCompoundRel, Long>, QuerydslPredicateExecutor<IngredientCompoundRel> {

    Optional<IngredientCompoundRel> findByCompoundId(final Long id);

    IngredientCompoundRel findByIngredientId(Long id);

    List<IngredientCompoundRel> findByIngredientIdAndCompoundId(final Long ingredientId, final Long compoundId);

    Optional<IngredientCompoundRel> findByIngredientIdAndCompoundIdAndMethod(final Long ingredientId,
            final Long compoundId, final Method method);

}
