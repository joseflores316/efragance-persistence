package com.efragance.persistence.repositories;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.DilutionTest;
import com.efragance.persistence.models.IngredientTest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IngredientTestRepository extends BaseRepository<IngredientTest, Long> , QuerydslPredicateExecutor<IngredientTest> {

    @Query("from DilutionTest")
    List<DilutionTest> findAllDilutions();





}
