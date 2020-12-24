package com.efragance.persistence.formula.repositories;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.formula.models.Formula;

/**
 * The Interface FormulaRepository.
 */
@Repository
public interface FormulaRepository extends BaseRepository<Formula, Long>, QuerydslPredicateExecutor<Formula> {

    /**
     * Find by name.
     *
     * @param name the name
     * @return the optional
     */
    Optional<Formula> findByName(String name);

    /**
     * Find by Name and id not.
     *
     * @param name      the name
     * @param formulaId the formula id
     * @return the optional
     */
    Optional<Formula> findByNameAndIdNot(String name, Long formulaId);

    // @formatter:off
    @Query(value = "SELECT DISTINCT a.SUBFORMULA_ID" +
         "  FROM FORMULAS_REL a" +
         "  INNER JOIN (" +
         "     SELECT SUBFORMULA_ID,(MAX(RELATION_LEVEL) - :level ) as relmax FROM FORMULAS_REL" +
         "     GROUP BY SUBFORMULA_ID" +
         "  ) b ON a.SUBFORMULA_ID = b.SUBFORMULA_ID" +
         " WHERE b.relmax > 0"
           ,nativeQuery = true)
    // @formatter:on
    Set<Long> getIdFormulasByRelationLevel(@Param(value = "level") int level);
}
