package com.efragance.persistence.formula.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.formula.models.FormulaDilutionRel;

/**
 * The Interface FormulaDilutionRelRepository.
 */
@Repository
public interface FormulaDilutionRelRepository
        extends BaseRepository<FormulaDilutionRel, Long>, QuerydslPredicateExecutor<FormulaDilutionRel> {

}
