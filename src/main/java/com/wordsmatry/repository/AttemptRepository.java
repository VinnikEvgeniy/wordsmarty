package com.wordsmatry.repository;

import com.wordsmatry.domain.Attempt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
@Repository
public interface AttemptRepository extends JpaRepository<Attempt, Long> {
}
