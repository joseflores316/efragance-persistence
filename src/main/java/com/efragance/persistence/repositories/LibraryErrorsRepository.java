package com.efragance.persistence.repositories;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.LibraryErrors;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryErrorsRepository extends BaseRepository<LibraryErrors, Long>, QuerydslPredicateExecutor<LibraryErrors> {
}