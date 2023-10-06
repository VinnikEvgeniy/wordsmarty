package com.wordsmatry.service;

import com.wordsmatry.api.InGameIncomeDTO;
import java.util.List;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */

public interface InGameIncomeService {
	void save(InGameIncomeDTO inGameIncomeDTO);

	void delete(Long id);

	InGameIncomeDTO findById(Long id);

	List<InGameIncomeDTO> findAll();
}
