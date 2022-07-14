package com.efragance.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.efragance.persistence.enumerator.MethodTableEnum;
import com.efragance.persistence.models.MethodTable;

@Repository
public interface MethodTableRepository extends JpaRepository<MethodTable, Long> {

	MethodTable findByMethodTableEnum(MethodTableEnum methodTableEnum);

	MethodTable findByMethodTableEnum(String methodTableEnum);

}
