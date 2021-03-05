package com.joaogsrocha.jhipster_small_test.repository;

import com.joaogsrocha.jhipster_small_test.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
