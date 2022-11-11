package com.efragance.persistence.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.Coelution;

@Repository
public interface CoelutionRepository extends BaseRepository<Coelution, Long>, QuerydslPredicateExecutor<Coelution>{

}
