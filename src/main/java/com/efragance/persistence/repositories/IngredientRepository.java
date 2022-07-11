package com.efragance.persistence.repositories;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.Ingredient;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface IngredientRepository extends BaseRepository<Ingredient, Long> , QuerydslPredicateExecutor<Ingredient> {

//    @Query("from DilutionTest")
//    List<DilutionTest> findAllDilutions();





}
