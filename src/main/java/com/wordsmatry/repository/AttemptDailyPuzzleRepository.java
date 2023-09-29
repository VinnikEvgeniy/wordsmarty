package com.wordsmatry.repository;

import com.wordsmatry.domain.AttemptDailyPuzzle;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
public interface AttemptDailyPuzzleRepository extends JpaRepository<AttemptDailyPuzzle, Long> {
}
