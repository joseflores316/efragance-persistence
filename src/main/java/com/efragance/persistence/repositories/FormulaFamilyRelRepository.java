package com.efragance.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.FormulaFamilyRel;
import com.efragance.persistence.projections.FormulaFamilyRelDescriptions;

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
    @Query(value= "SELECT ff.id as familyId,ff.code as familyCode,ff.i18n as familyI18n, "
                + "subff.id as subFamilyId,subff.code as subFamilyCode, subff.i18n as subFamilyI18n "
                + "FROM FormulaFamilyRel ffrel "
                + "INNER JOIN FormulaFamily ff ON ff.id = ffrel.familyId "
                + "INNER JOIN FormulaSubFamily subff on subff.id = ffrel.subFamilyId "
                + "WHERE ffrel.formulaId = :formulaId")
    // @formatter:on
    List<FormulaFamilyRelDescriptions> getFamiliesDescriptions(@Param(value = "formulaId") Long formulaId);

}
