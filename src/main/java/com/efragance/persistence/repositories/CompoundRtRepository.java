package com.efragance.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.CompoundRT;

/**
 * The Interface CompoundRtRepository.
 */
@Repository
public interface CompoundRtRepository extends BaseRepository<CompoundRT, Long>, QuerydslPredicateExecutor<CompoundRT> {

    List<CompoundRT> findByCompoundId(final Long compoundId);

    @Modifying
    @Query(nativeQuery = true, value = "delete from compound_rt  where  compound_id=:compoundId")
    void deleteByCompoundId(@Param("compoundId") final Long compoundId);
}
