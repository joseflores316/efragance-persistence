package com.efragance.persistence.repositories.custom.impl;

import com.efragance.persistence.repositories.custom.CompoundCustomRepository;
import com.efragance.persistence.repositories.filter.CompoundFilter;
import com.querydsl.core.BooleanBuilder;

import java.util.Optional;

public class CompoundCustomRepositoryImpl extends GenericCustomRepository implements CompoundCustomRepository {

//     QCompound dvvd;


    @Override
    public BooleanBuilder getBuilderByFilter(CompoundFilter filter) {

        BooleanBuilder builder = new BooleanBuilder();

//        Optional.ofNullable(filter.getId()).ifPresent(id -> addFilterByLongValue(id, installation.id, builder));
        return builder;
    }
}
