package com.efragance.persistence.config;

/**
 * The Class EfragancePersistConfigConstants.
 */
public final class EfragancePersistConfigConstants {

    /**
     * Instantiates a new config constants.
     */
    private EfragancePersistConfigConstants() {
    }

    /** The jpa repository packages. */
    public static final String JPA_REPOSITORY_PACKAGES = "com.efragance.persistence";

    /** The entity packages. */
    public static final String ENTITY_PACKAGES = "com.efragance.persistence";

    /** The db configurator. */
    public static final String DB_CONFIGURATOR = "efraganceDataBaseConfigurator";

    /** The Constant DB_CONFIG_PREFIX. */
    public static final String DB_CONFIG_PREFIX = "efragance-database-config";

    /** The Constant DATA_SOURCE. */
    public static final String DATA_SOURCE = "efraganceDataSource";

    /** The customer entity manager. */
    public static final String ENTITY_MANAGER = "efraganceEntityManager";

    /** The customer transaction manager. */
    public static final String TRANSACTION_MANAGER = "efraganceTransactionManager";

    /** The impl repository postfix. */
    public static final String IMPL_REPOSITORY_POSTFIX = "Custom";

    /** The Constant AUDITOR_AWARE. */
    public static final String AUDITOR_AWARE = "efraganceAuditorAware";

}
