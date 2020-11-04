package com.efragance.persistence.formula.enums;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import com.efragance.arch.common.utils.ParamUtils;

/**
 * The Enum SubFamily.
 */
public enum SubFamily {

    /** The to be define. */
    TO_BE_DEFINE(1L, "TO_BE_DEFINE");

    /** The Constant MAPPING_BY_ID. */
    private static final ConcurrentHashMap<Long, SubFamily> MAPPING_BY_ID = new ConcurrentHashMap<>();

    /** The Constant MAPPING_BY_CODE. */
    private static final ConcurrentHashMap<String, SubFamily> MAPPING_BY_CODE = new ConcurrentHashMap<>();

    static {
        for (final SubFamily type : values()) {
            MAPPING_BY_ID.put(type.getId(), type);
            MAPPING_BY_CODE.put(type.getCode(), type);
        }
    }

    /** The id. */
    private Long id;

    /** The code. */
    private String code;

    /**
     * Instantiates a new sub family.
     *
     * @param id   the id
     * @param code the code
     */
    private SubFamily(final Long id, final String code) {
        this.id = id;
        this.code = code;
    }

    /**
     * Gets the mapping.
     *
     * @param id the id
     * @return the mapping
     */
    public static synchronized Optional<SubFamily> getMapping(final Long id) {
        SubFamily prStatus = null;
        final SubFamily prStatusEnum = MAPPING_BY_ID.get(id);
        if (!ParamUtils.objectIsNull(prStatusEnum)) {
            prStatus = prStatusEnum;
        }

        return Optional.ofNullable(prStatus);
    }

    /**
     * Gets the mapping.
     *
     * @param code the code
     * @return the mapping
     */
    public static synchronized Optional<SubFamily> getMapping(final String code) {
        SubFamily prStatus = null;
        final SubFamily prStatusEnum = MAPPING_BY_CODE.get(code);
        if (!ParamUtils.objectIsNull(prStatusEnum)) {
            prStatus = prStatusEnum;
        }

        return Optional.ofNullable(prStatus);
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * Gets the code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the code.
     *
     * @param code the new code
     */
    public void setCode(final String code) {
        this.code = code;
    }

}
