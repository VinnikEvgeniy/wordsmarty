package com.wordsmatry.service;

import com.wordsmatry.api.LevelDTO;
import java.util.List;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
public interface LevelService {
	void save(LevelDTO levelDTO);

	void delete(Long id);

	LevelDTO findById(Long id);

	List<LevelDTO> findAll();
}
