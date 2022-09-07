package com.efragance.persistence.repositories;

import com.efragance.persistence.enumerator.IdentificationTableEnum;
import com.efragance.persistence.models.IdentificationTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentificationTableRepository extends JpaRepository<IdentificationTable, Long> {

    IdentificationTable findByIdentificationTableEnum(IdentificationTableEnum identificationTableEnum);

    IdentificationTable findByIdentificationTableName(String methodName);

}
