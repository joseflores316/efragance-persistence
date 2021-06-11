package com.efragance.persistence.certificates.projections;

import java.math.BigDecimal;

import com.efragance.persistence.certificates.models.CertificateType;

/**
 * The Interface CertificateBasicInfo.
 */
public interface CertificateBasicInfo {

    /**
     * Gets the id.
     *
     * @return the id
     */
    Long getId();

    /**
     * Gets the type.
     *
     * @return the type
     */
    CertificateType getType();

    /**
     * Gets the formula id.
     *
     * @return the formula id
     */
    Long getFormulaId();

    /**
     * Gets the formula name.
     *
     * @return the formula name
     */
    String getFormulaName();

    /**
     * Gets the formula code.
     *
     * @return the formula code
     */
    String getFormulaCode();

    /**
     * Gets the sap code.
     *
     * @return the sap code
     */
    String getSapCode();

    /**
     * Gets the application id.
     *
     * @return the application id
     */
    Long getApplicationId();

    /**
     * Gets the application name.
     *
     * @return the application name
     */
    String getApplicationName();

    /**
     * Gets the dose.
     *
     * @return the dose
     */
    BigDecimal getDose();

}
