package com.efragance.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.efragance.persistence.enumerator.MethodTableEnum;
import com.efragance.persistence.models.MethodTableEntity;

@Repository
public interface MethodTableRepository extends JpaRepository<MethodTableEntity, Long> {

	MethodTableEntity findByMethodTableEnum(MethodTableEnum methodTableEnum);

}
