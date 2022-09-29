package com.efragance.persistence.repositories;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.MsFidRel;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface MsFidFileRelRepository extends BaseRepository<MsFidRel, Long>, QuerydslPredicateExecutor<MsFidRel> {


}
