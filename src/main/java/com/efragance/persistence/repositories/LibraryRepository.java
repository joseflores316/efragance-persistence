package com.efragance.persistence.repositories;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.Library;
import com.efragance.persistence.models.RawMaterial;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LibraryRepository extends BaseRepository<Library, Long>, QuerydslPredicateExecutor<Library> {
    Optional<Library> findByName(String name);

}
