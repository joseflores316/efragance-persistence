package com.efragance.persistence.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.FormulaDilutionRel;

/**
 * The Interface FormulaDilutionRelRepository.
 */
@Repository
public interface FormulaDilutionRelRepository
        extends BaseRepository<FormulaDilutionRel, Long>, QuerydslPredicateExecutor<FormulaDilutionRel> {

    long countByDilutionIdAndFormulaId(long dilutionId, long formulaId);

    Optional<FormulaDilutionRel> findByDilutionIdAndFormulaId(long dilutionId, long formulaId);

	Iterable<FormulaDilutionRel> findByFormulaIdIn(List<Long> ids);

	Optional<FormulaDilutionRel> findByFormulaIdAndDilutionId(Long id, Long id2);

	void deleteByFormulaIdAndDilutionId(Long id, Long ingredientId);

}
