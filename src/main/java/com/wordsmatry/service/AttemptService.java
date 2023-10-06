package com.wordsmatry.service;

import com.wordsmatry.api.AttemptDTO;
import java.util.List;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */

public interface AttemptService {
	void save(AttemptDTO attemptDTO);

	void delete(Long id);

	AttemptDTO findById(Long id);

	List<AttemptDTO> findAll();
}
