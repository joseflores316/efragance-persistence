package com.efragance.persistence.repositories;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.enumerator.MethodEnum;
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

    Optional<CompoundRT> findByCompoundIdAndMethod(final Long compoundId, final MethodEnum meethod);

	Optional<CompoundRT> findByCompoundIdAndMethodAndRttStatus(final Long id, final MethodEnum method, final String rttStatus);

	Optional<CompoundRT> findByCompoundIdAndMethodAndRttAndRttStatus(Long compoundd, MethodEnum method, BigDecimal rttValue, String rttStatus);

	List<CompoundRT> findByMethodAndRttGreaterThanEqualAndRttLessThanEqual(final MethodEnum method, BigDecimal rttStart, BigDecimal rttEnd);
	
}
