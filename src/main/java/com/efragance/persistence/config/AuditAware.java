package com.efragance.persistence.config;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * The Class AuditAware.
 */
public class AuditAware implements AuditorAware<String> {

    /**
     * Gets the current auditor.
     *
     * @return the current auditor
     */
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.ofNullable(SecurityContextHolder.getContext().getAuthentication().getName());
    }

}
