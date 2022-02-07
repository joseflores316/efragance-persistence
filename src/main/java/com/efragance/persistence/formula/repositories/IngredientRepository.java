package com.efragance.persistence.formula.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.formula.dto.IngredientListDto;
import com.efragance.persistence.formula.models.Ingredient;

/**
 * The Interface IngredientRepository.
 */
@Repository
public interface IngredientRepository extends BaseRepository<Ingredient, Long>, QuerydslPredicateExecutor<Ingredient> {

    @Query(nativeQuery = true)
    List<IngredientListDto> findAllIngredient();

    // @formatter:off
    @Query(nativeQuery = true, value = "SELECT  frmr.RAW_MATERIAL_ID  FROM FORMULAS_RAW_MATERIALS_REL frmr "
                 + "LEFT JOIN RAW_MATERIALS rm ON frmr.RAW_MATERIAL_ID = rm.ID  "
                 + "GROUP BY frmr.RAW_MATERIAL_ID "
                 + "ORDER BY frmr.RAW_MATERIAL_ID "
                 + "Limit 8"
    )
     // @formatter:on

    List<Long> findRawMaterialIdGroupBy();

}
