package com.efragance.persistence.repositories.custom;

import com.efragance.persistence.repositories.filter.CompoundFilter;
import com.querydsl.core.BooleanBuilder;

public interface CompoundCustomRepository {

    BooleanBuilder getBuilderByFilter(CompoundFilter filter);
}
