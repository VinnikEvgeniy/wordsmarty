package com.wordsmatry.service;

import com.wordsmatry.api.InGameResourceSpendingDTO;
import java.util.List;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
public interface InGameResourceSpendingService {
	void save(InGameResourceSpendingDTO inGameResourceSpendingDTO);

	void delete(Long id);

	InGameResourceSpendingDTO findById(Long id);

	List<InGameResourceSpendingDTO> findAll();
}
