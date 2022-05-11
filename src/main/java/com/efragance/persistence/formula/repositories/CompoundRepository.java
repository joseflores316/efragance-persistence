package com.efragance.persistence.formula.repositories;

import java.util.Optional;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.formula.models.Compound;
import com.efragance.persistence.formula.models.IngredientAttr;

/**
 * The Interface CompoundRepository
 */
@Repository
public interface CompoundRepository extends BaseRepository<Compound, Long>, QuerydslPredicateExecutor<IngredientAttr> {

    Optional<Compound> findByCompoundRtId(final Long compoundRtId);

}
