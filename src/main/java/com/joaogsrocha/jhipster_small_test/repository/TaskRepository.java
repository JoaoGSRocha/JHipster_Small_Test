package com.joaogsrocha.jhipster_small_test.repository;

import com.joaogsrocha.jhipster_small_test.domain.Task;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Task entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
