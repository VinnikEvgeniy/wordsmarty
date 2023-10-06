package com.wordsmatry.service;

import com.wordsmatry.api.AttemptDailyPuzzleDTO;
import java.util.List;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */

public interface AttemptDailyPuzzleService {
	void save(AttemptDailyPuzzleDTO attemptDailyPuzzleDTO);

	void delete(Long id);

	AttemptDailyPuzzleDTO findById(Long id);

	List<AttemptDailyPuzzleDTO> findAll();
}
