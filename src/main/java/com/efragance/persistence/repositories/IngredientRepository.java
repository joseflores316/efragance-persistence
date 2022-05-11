package com.efragance.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.dto.IngredientListDto;
import com.efragance.persistence.models.Ingredient;

/**
 * The Interface IngredientRepository.
 */
@Repository
public interface IngredientRepository extends BaseRepository<Ingredient, Long>, QuerydslPredicateExecutor<Ingredient> {

    @Query(nativeQuery = true)
    List<IngredientListDto> findRawMaterials();

    @Query(nativeQuery = true)
    List<IngredientListDto> findDilutions();

    List<Ingredient> findByIdExternal(final Long idExternal);

}
