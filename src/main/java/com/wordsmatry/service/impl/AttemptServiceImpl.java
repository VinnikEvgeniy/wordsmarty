package com.wordsmatry.service.impl;

import com.wordsmatry.api.AttemptDTO;
import com.wordsmatry.mapper.AttemptMapper;
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
	@Autowired
	AttemptMapper attemptMapper;

	@Override
	public void save(AttemptDTO attempt) {
		attemptRepository.save(attemptMapper.toEntity(attempt));
	}

	@Override
	public void delete(Long id) {
		attemptRepository.deleteById(id);
	}

	@Override
	public AttemptDTO findById(Long id) {
		return attemptMapper.toApi(attemptRepository.findById(id).orElseThrow());
	}

	@Override
	public List<AttemptDTO> findAll() {
		return attemptMapper.toApi(attemptRepository.findAll());
	}
}