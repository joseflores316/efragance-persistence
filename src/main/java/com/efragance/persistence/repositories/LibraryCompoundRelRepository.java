package com.efragance.persistence.repositories;

import java.util.List;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.LibraryCompoundRel;

@Repository
public interface LibraryCompoundRelRepository extends BaseRepository<LibraryCompoundRel, Long>, QuerydslPredicateExecutor<LibraryCompoundRel> {

	List<LibraryCompoundRel> findByLibraryIdAndCompoundId(Long libraryId, Long compoundId);

}
