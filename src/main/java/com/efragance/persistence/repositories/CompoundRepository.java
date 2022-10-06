package com.efragance.persistence.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.Compound;
import com.efragance.persistence.models.CompoundRT;

/**
 * The Interface CompoundRepository
 */
@Repository
public interface CompoundRepository extends BaseRepository<Compound, Long>, QuerydslPredicateExecutor<Compound> {

	Optional<Compound> findByTagI18n(String tagI18n);

	Compound findTopByOrderByIdDesc();

	List<Compound> findByCompoundRTSIn(List<CompoundRT> compoundRTList);
	
}
