package com.efragance.persistence.formula.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.formula.models.FamilySubFamilyRel;

/**
 * The Interface FamilySubFamilyRelRepository.
 */
public interface FamilySubFamilyRelRepository
        extends BaseRepository<FamilySubFamilyRel, Long>, QuerydslPredicateExecutor<FamilySubFamilyRel> {

}
