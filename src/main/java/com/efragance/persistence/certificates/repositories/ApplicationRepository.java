package com.efragance.persistence.certificates.repositories;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.certificates.models.Application;

/**
 * The Interface ApplicationRepository.
 */
@Repository
public interface ApplicationRepository
        extends BaseRepository<Application, Long>, QuerydslPredicateExecutor<Application> {

}
