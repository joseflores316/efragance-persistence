package com.efragance.persistence.repositories.custom.impl;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.dsl.NumberPath;

import java.util.Optional;

public class GenericCustomRepository {

    public void addFilterByLongValue(Long id, NumberPath<Long> path, BooleanBuilder builder)
    {
        Optional.ofNullable(id).ifPresent(value -> builder.and(path.eq(value)));
    }
}
