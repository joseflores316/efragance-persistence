package com.efragance.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.persistence.models.UserRole;
import com.efragance.persistence.models.UserRolePk;

/**
 * The Interface UserRoleRepository.
 */
@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, UserRolePk>, QuerydslPredicateExecutor<UserRole> {

    /**
     * Find by user id.
     *
     * @param userId the user id
     * @return the list
     */
    List<UserRole> findByUserId(Long userId);

}
