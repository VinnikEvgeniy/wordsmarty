package com.wordsmatry.service;

import com.wordsmatry.domain.AttemptDailyPuzzle;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */

public interface AttemptDailyPuzzleService {
	void save(AttemptDailyPuzzle attemptDailyPuzzle);

	void delete(Long id);

	AttemptDailyPuzzle findById(Long id);

	List<AttemptDailyPuzzle> findAll();
}
