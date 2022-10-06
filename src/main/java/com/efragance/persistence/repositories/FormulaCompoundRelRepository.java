package com.efragance.persistence.repositories;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.FormulaCompoundRel;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FormulaCompoundRelRepository extends BaseRepository<FormulaCompoundRel, Long>, QuerydslPredicateExecutor<FormulaCompoundRel> {

    /*@Query(value = "select fcr.id, fcr.formulaId, fcr.compoundId, " +
            "nvl((select fca.rt from FormulaCompArea fca where fca.formulaCompoundRelId = fcr.id and fca.methodTableId = 2), (select fcs.rt from FormulaCompSuggestion fcs where fcs.formulaCompoundRelId = fcr.id and fcs.methodTableId=2)) as rtSIL," +
            "nvl((select fca.rt from FormulaCompArea fca where fca.formulaCompoundRelId = fcr.id and fca.methodTableId = 1), (select fcs.rt from FormulaCompSuggestion fcs where fcs.formulaCompoundRelId = fcr.id and fcs.methodTableId=1)) as rtCBW" +
            " from FormulaCompoundRel fcr")
    List<FormulaCompoundRelDto> findDTOByFormulaIdAndCompoundId(Long formulaId, Long compoundId);*/


//    @Query(value = "select fcr.id, fcr.FORMULA_ID, fcr.COMPOUND_ID, " +
//            "nvl((select fca.rt from FORMULA_COMP_AREA fca where fca.FORMULA_COMPOUND_REL_ID = fcr.id and fca.METHOD_TABLE_ID = 2), (select fcs.rt from FORMULA_COMP_SUGGESTION fcs where fcs.FORMULA_COMPOUND_REL_ID = fcr.id and fcs.METHOD_TABLE_ID=2)) as rtSIL," +
//            "nvl((select fca.rt from FORMULA_COMP_AREA fca where fca.FORMULA_COMPOUND_REL_ID = fcr.id and fca.METHOD_TABLE_ID = 1), (select fcs.rt from FORMULA_COMP_SUGGESTION fcs where fcs.FORMULA_COMPOUND_REL_ID = fcr.id and fcs.METHOD_TABLE_ID=1)) as rtCBW" +
//            " from FORMULA_COMPOUND_REL fcr" , nativeQuery = true)
//    List<FormulaCompoundRelDto> findDTOByFormulaIdAndCompoundId(Long formulaId, Long compoundId);

    List<FormulaCompoundRel> findByFormulaIdAndCompoundId(Long formulaId, Long compoundId);


    Optional<FormulaCompoundRel> findById(Long id);
}
