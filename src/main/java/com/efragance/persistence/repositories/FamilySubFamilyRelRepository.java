package com.efragance.persistence.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.FamilySubFamilyRel;

/**
 * The Interface FamilySubFamilyRelRepository.
 */
public interface FamilySubFamilyRelRepository
        extends BaseRepository<FamilySubFamilyRel, Long>, QuerydslPredicateExecutor<FamilySubFamilyRel> {

}
