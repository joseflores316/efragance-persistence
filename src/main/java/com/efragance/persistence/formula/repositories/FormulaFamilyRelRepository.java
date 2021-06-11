package com.efragance.persistence.formula.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.formula.models.FormulaFamilyRel;
import com.efragance.persistence.formula.projections.FormulaFamilyRelDescriptions;

/**
 * The Interface FormulaFamilyRelRepository.
 */
public interface FormulaFamilyRelRepository
        extends BaseRepository<FormulaFamilyRel, Long>, QuerydslPredicateExecutor<FormulaFamilyRel> {

    /**
     * Gets the families descriptions.
     *
     * @param formulaId the formula id
     * @return the families descriptions
     */
    // @formatter:off
    @Query(value= "SELECT ff.code as familyCode,ff.i18n as familyI18n, subff.code as subFamilyCode, subff.i18n as subFamilyI18n "
                + "FROM FormulaFamilyRel ffrel "
                + "INNER JOIN FormulaFamily ff ON ff.id = ffrel.familyId "
                + "INNER JOIN FormulaSubFamily subff on subff.id = ffrel.subFamilyId "
                + "WHERE ffrel.formulaId = :formulaId")
    // @formatter:on
    List<FormulaFamilyRelDescriptions> getFamiliesDescriptions(@Param(value = "formulaId") Long formulaId);

}
