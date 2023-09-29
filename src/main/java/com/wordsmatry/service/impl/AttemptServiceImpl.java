package com.wordsmatry.service.impl;

import com.wordsmatry.domain.Attempt;
import com.wordsmatry.repository.AttemptRepository;
import com.wordsmatry.service.AttemptService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
@Service
public class AttemptServiceImpl implements AttemptService {
	@Autowired
	AttemptRepository attemptRepository;

	@Override
	public void save(Attempt attempt) {
		attemptRepository.save(attempt);
	}

	@Override
	public void delete(Long id) {
		attemptRepository.deleteById(id);
	}

	@Override
	public Attempt findById(Long id) {
		return attemptRepository.findById(id).orElseThrow();
	}

	@Override
	public List<Attempt> findAll() {
		return attemptRepository.findAll();
	}
}
