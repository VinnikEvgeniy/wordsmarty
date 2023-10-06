package com.wordsmatry.service.impl;

import com.wordsmatry.api.AttemptDailyPuzzleDTO;
import com.wordsmatry.mapper.AttemptDailyPuzzleMapper;
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
	@Autowired
	AttemptDailyPuzzleMapper attemptDailyPuzzleMapper;

	@Override
	public void save(AttemptDailyPuzzleDTO attemptDailyPuzzle) {
		attemptDailyPuzzleRepository.save(attemptDailyPuzzleMapper.toEntity(attemptDailyPuzzle));
	}

	@Override
	public void delete(Long id) {
		attemptDailyPuzzleRepository.deleteById(id);
	}

	@Override
	public AttemptDailyPuzzleDTO findById(Long id) {
		return attemptDailyPuzzleMapper.toApi(attemptDailyPuzzleRepository.findById(id).orElseThrow());
	}

	@Override
	public List<AttemptDailyPuzzleDTO> findAll() {
		return attemptDailyPuzzleMapper.toApi(attemptDailyPuzzleRepository.findAll());
	}
}