package com.wordsmatry.service.impl;

import com.wordsmatry.api.LevelDTO;
import com.wordsmatry.mapper.LevelMapper;
import com.wordsmatry.repository.LevelRepository;
import com.wordsmatry.service.AccountService;
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
	private AccountService accountService;
	@Autowired
	private LevelRepository levelRepository;
	@Autowired
	private LevelMapper levelMapper;

	@Override
	public void save(LevelDTO levelDTO) {
		if (levelDTO.getUserId() != null && accountService.findByUserId(levelDTO.getUserId()) != null) {
			levelRepository.save(levelMapper.toEntity(levelDTO));
		}
	}

	@Override
	public void delete(Long id) {
		levelRepository.deleteById(id);
	}

	@Override
	public LevelDTO findById(Long id) {
		return levelMapper.toApi(levelRepository.findById(id).orElseThrow());
	}

	@Override
	public List<LevelDTO> findAll() {
		return levelMapper.toApi(levelRepository.findAll());
	}
}