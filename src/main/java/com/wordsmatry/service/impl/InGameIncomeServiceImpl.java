package com.wordsmatry.service.impl;

import com.wordsmatry.domain.InGameIncome;
import com.wordsmatry.repository.InGameIncomeRepository;
import com.wordsmatry.service.InGameIncomeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
@Service
public class InGameIncomeServiceImpl implements InGameIncomeService {
	@Autowired
	InGameIncomeRepository inGameIncomeRepository;

	@Override
	public void save(InGameIncome inGameIncome) {
		inGameIncomeRepository.save(inGameIncome);
	}

	@Override
	public void delete(Long id) {
		inGameIncomeRepository.deleteById(id);
	}

	@Override
	public InGameIncome findById(Long id) {
		return inGameIncomeRepository.findById(id).orElseThrow();
	}

	@Override
	public List<InGameIncome> findAll() {
		return inGameIncomeRepository.findAll();
	}
}
