package com.wordsmatry.service.impl;

import com.wordsmatry.domain.Level;
import com.wordsmatry.repository.LevelRepository;
import com.wordsmatry.service.LevelService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
@Service
public class LevelServiceImpl implements LevelService {
	@Autowired
	LevelRepository levelRepository;

	@Override
	public void save(Level level) {
		levelRepository.save(level);
	}

	@Override
	public void delete(Long id) {
		levelRepository.deleteById(id);
	}

	@Override
	public Level findById(Long id) {
		return levelRepository.findById(id).orElseThrow();
	}

	@Override
	public List<Level> findAll() {
		return levelRepository.findAll();
	}
}
