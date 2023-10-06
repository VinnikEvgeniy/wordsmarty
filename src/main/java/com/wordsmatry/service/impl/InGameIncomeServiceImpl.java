package com.wordsmatry.service.impl;

import com.wordsmatry.api.InGameIncomeDTO;
import com.wordsmatry.mapper.InGameIncomeMapper;
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
	@Autowired
	InGameIncomeMapper inGameIncomeMapper;

	@Override
	public void save(InGameIncomeDTO inGameIncome) {
		inGameIncomeRepository.save(inGameIncomeMapper.toEntity(inGameIncome));
	}

	@Override
	public void delete(Long id) {
		inGameIncomeRepository.deleteById(id);
	}

	@Override
	public InGameIncomeDTO findById(Long id) {
		return inGameIncomeMapper.toApi(inGameIncomeRepository.findById(id).orElseThrow());
	}

	@Override
	public List<InGameIncomeDTO> findAll() {
		return inGameIncomeMapper.toApi(inGameIncomeRepository.findAll());
	}
}