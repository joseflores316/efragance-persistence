package com.efragance.persistence.formula.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.formula.models.OlfactiveNote;

/**
 * The Interface OlfactiveNoteRepository.
 */
public interface OlfactiveNoteRepository
        extends BaseRepository<OlfactiveNote, Long>, QuerydslPredicateExecutor<OlfactiveNote> {

}
