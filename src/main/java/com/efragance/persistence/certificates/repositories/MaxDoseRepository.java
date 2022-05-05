package com.efragance.persistence.certificates.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.MaxDose;

/**
 * The Interface MaxDoseRepository.
 */
@Repository
public interface MaxDoseRepository extends BaseRepository<MaxDose, Long>, QuerydslPredicateExecutor<MaxDose> {

}
