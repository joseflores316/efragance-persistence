package com.efragance.persistence.certificates.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.certificates.projections.CertificateBasicInfo;
import com.efragance.persistence.models.Certificate;

/**
 * The Interface CertificatesRepository.
 */
@Repository
public interface CertificateRepository
        extends BaseRepository<Certificate, Long>, QuerydslPredicateExecutor<Certificate> {

    // @formatter:off
    @Query(value = "SELECT cert.ID as Id,cert.TYPE as Type,f.Id as FormulaId,f.NAME as FormulaName, f.CODE as FormulaCode,"
            + "ms.DOSE as Dose,app.ID as ApplicationId, app.NAME as ApplicationName," +
            "si.SAP_CODE as SapCode" +
            " FROM  CERTIFICATES cert " +
            " INNER JOIN MAX_DOSE ms" +
                  " ON cert.MAX_DOSE_ID = ms.ID" +
            " INNER JOIN APPLICATIONS app" +
                  " ON app.ID = ms.APPLICATION_ID" +
            " INNER JOIN FORMULAS f" +
                  " ON ms.FORMULA_ID = f.ID" +
            " LEFT JOIN SAP_INTEGRATIONS si ON si.FORMULA_ID = f.ID" +
         " WHERE cert.ID = :certificateId"
           ,nativeQuery = true)
    // @formatter:on
    CertificateBasicInfo getCertificateBaseInfo(@Param(value = "certificateId") Long certificateId);
}
