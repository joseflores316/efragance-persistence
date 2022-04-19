package com.efragance.persistence.i18n.repositories;

import java.util.List;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.i18n.models.I18n;

/**
 * The Interface I18nRepository.
 */
@Repository
public interface I18nRepository extends BaseRepository<I18n, Long>, QuerydslPredicateExecutor<I18n> {

    List<I18n> findByTagI18nAndLocale(final String tagI18n, final String locale);

    List<I18n> findByTagI18n(final String tagI18n);

}
