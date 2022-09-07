package com.efragance.persistence.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.I18n;

/**
 * The Interface I18nRepository.
 */
@Repository
public interface I18nRepository extends BaseRepository<I18n, Long>, QuerydslPredicateExecutor<I18n> {

    List<I18n> findByTagI18nAndLocale(final String tagI18n, final String locale);

    List<I18n> findByTagI18n(final String tagI18n);

    @Modifying
    @Query(nativeQuery = true, value = "delete from i18n  where  tag_i18n=:tagI18n")
    void delete(@Param("tagI18n") final String tagI18n);

	Optional<I18n> findByTextAndLocale(String text, String lenguage);

    Optional<I18n> findByText(String text);

}
