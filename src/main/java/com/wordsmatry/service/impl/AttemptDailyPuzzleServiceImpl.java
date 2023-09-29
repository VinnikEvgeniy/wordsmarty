package com.wordsmatry.service.impl;

import com.wordsmatry.domain.AttemptDailyPuzzle;
import com.wordsmatry.repository.AttemptDailyPuzzleRepository;
import com.wordsmatry.service.AttemptDailyPuzzleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
@Service
public class AttemptDailyPuzzleServiceImpl implements AttemptDailyPuzzleService {
	@Autowired
	AttemptDailyPuzzleRepository attemptDailyPuzzleRepository;

	@Override
	public void save(AttemptDailyPuzzle attemptDailyPuzzle) {
		attemptDailyPuzzleRepository.save(attemptDailyPuzzle);
	}

	@Override
	public void delete(Long id) {
		attemptDailyPuzzleRepository.deleteById(id);
	}

	@Override
	public AttemptDailyPuzzle findById(Long id) {
		return attemptDailyPuzzleRepository.findById(id).orElseThrow();
	}

	@Override
	public List<AttemptDailyPuzzle> findAll() {
		return attemptDailyPuzzleRepository.findAll();
	}
}
