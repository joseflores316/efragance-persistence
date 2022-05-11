package com.efragance.persistence.repositories;

import java.util.Optional;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.efragance.arch.persistence.repositories.interfaces.BaseRepository;
import com.efragance.persistence.models.User;

/**
 * The Interface UserRepository.
 */
@Repository
public interface UserRepository extends BaseRepository<User, Long>, QuerydslPredicateExecutor<User> {

    /**
     * Find by user name.
     *
     * @param name the name
     * @return the user
     */
    Optional<User> findByUserName(String userName);

    /**
     * Find by name and id not.
     *
     * @param username the user name
     * @param userId   the user id
     * @return the optional
     */
    Optional<User> findByUserNameAndIdNot(String userName, Long userId);

}
