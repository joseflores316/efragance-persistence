package com.efragance.persistence.formula.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.formula.models.FormulaOlfactiveNoteRel;

/**
 * The Interface FormulaOlfactiveNoteRelRepository.
 */
public interface FormulaOlfactiveNoteRelRepository
        extends BaseRepository<FormulaOlfactiveNoteRel, Long>, QuerydslPredicateExecutor<FormulaOlfactiveNoteRel> {

    // @formatter:off
    @Query(value = "SELECT rel" +
            " FROM  FormulaOlfactiveNoteRel rel " +
            " WHERE rel.formulaId IN ( "
                              + "SELECT formu.id "
                              + "FROM Formula formu "
                              + "WHERE lower(formu.code) = lower(:searchCode)"
                              + ")"
                  + " OR rel.formulaId IN ( "
                              + "SELECT sapi.formulaId "
                              + "FROM SapIntegration sapi "
                              + "WHERE lower(sapi.sapCode) = lower(:searchCode)"
                              + ")"
    )
     // @formatter:on
    List<FormulaOlfactiveNoteRel> findByFormulaCodes(@Param(value = "searchCode") String searchCode);

}
