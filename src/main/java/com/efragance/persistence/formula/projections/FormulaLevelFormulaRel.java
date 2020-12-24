package com.efragance.persistence.formula.projections;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * The Class FormulaLevelFormulaRel.
 */
public class FormulaLevelFormulaRel {

    /** The formula id. */
    private Long formulaId;

    /** The formula code. */
    private String formulaCode;

    /** The formula name. */
    private String formulaName;

    /** The sub formula id. */
    private Long subFormulaId;

    /** The raw material id. */
    private Long rawMaterialId;

    /** The raw material code. */
    private String rawMaterialCode;

    /** The raw material name. */
    private String rawMaterialName;

    /**
     * Instantiates a new formula level formula rel.
     *
     * @param formulaId       the formula id
     * @param formulaCode     the formula code
     * @param formulaName     the formula name
     * @param subFormulaId    the sub formula id
     * @param rawMaterialId   the raw material id
     * @param rawMaterialCode the raw material code
     * @param rawMaterialName the raw material name
     */
    public FormulaLevelFormulaRel(final Long formulaId, final String formulaCode, final String formulaName,
            final Long subFormulaId, final Long rawMaterialId, final String rawMaterialCode,
            final String rawMaterialName) {
        this.formulaId = formulaId;
        this.formulaCode = formulaCode;
        this.formulaName = formulaName;
        this.subFormulaId = subFormulaId;
        this.rawMaterialId = rawMaterialId;
        this.rawMaterialCode = rawMaterialCode;
        this.rawMaterialName = rawMaterialName;
    }

    /**
     * Gets the formula id.
     *
     * @return the formula id
     */
    public Long getFormulaId() {
        return formulaId;
    }

    /**
     * Sets the formula id.
     *
     * @param formulaId the new formula id
     */
    public void setFormulaId(final Long formulaId) {
        this.formulaId = formulaId;
    }

    /**
     * Gets the formula code.
     *
     * @return the formula code
     */
    public String getFormulaCode() {
        return formulaCode;
    }

    /**
     * Sets the formula code.
     *
     * @param formulaCode the new formula code
     */
    public void setFormulaCode(final String formulaCode) {
        this.formulaCode = formulaCode;
    }

    /**
     * Gets the formula name.
     *
     * @return the formula name
     */
    public String getFormulaName() {
        return formulaName;
    }

    /**
     * Sets the formula name.
     *
     * @param formulaName the new formula name
     */
    public void setFormulaName(final String formulaName) {
        this.formulaName = formulaName;
    }

    /**
     * Gets the sub formula id.
     *
     * @return the sub formula id
     */
    public Long getSubFormulaId() {
        return subFormulaId;
    }

    /**
     * Sets the sub formula id.
     *
     * @param subFormulaId the new sub formula id
     */
    public void setSubFormulaId(final Long subFormulaId) {
        this.subFormulaId = subFormulaId;
    }

    /**
     * Gets the raw material id.
     *
     * @return the raw material id
     */
    public Long getRawMaterialId() {
        return rawMaterialId;
    }

    /**
     * Sets the raw material id.
     *
     * @param rawMaterialId the new raw material id
     */
    public void setRawMaterialId(final Long rawMaterialId) {
        this.rawMaterialId = rawMaterialId;
    }

    /**
     * Gets the raw material code.
     *
     * @return the raw material code
     */
    public String getRawMaterialCode() {
        return rawMaterialCode;
    }

    /**
     * Sets the raw material code.
     *
     * @param rawMaterialCode the new raw material code
     */
    public void setRawMaterialCode(final String rawMaterialCode) {
        this.rawMaterialCode = rawMaterialCode;
    }

    /**
     * Gets the raw material name.
     *
     * @return the raw material name
     */
    public String getRawMaterialName() {
        return rawMaterialName;
    }

    /**
     * Sets the raw material name.
     *
     * @param rawMaterialName the new raw material name
     */
    public void setRawMaterialName(final String rawMaterialName) {
        this.rawMaterialName = rawMaterialName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(final Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        // @formatter:off
        return new ToStringBuilder(this, ToStringStyle.NO_CLASS_NAME_STYLE)
                .append("formulaId", getFormulaId())
                .append("formulaCode", getFormulaCode())
                .append("formulaName", getFormulaName())
                .append("subFormulaId", getSubFormulaId())
                .append("rawMaterialId", getRawMaterialId())
                .append("rawMaterialCode", getRawMaterialCode())
                .append("rawMaterialName", getRawMaterialName())
                .toString();
        // @formatter:on
    }

}
