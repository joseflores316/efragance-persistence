package com.efragance.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.efragance.persistence.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
