package com.wordsmatry.mapper;

import com.wordsmatry.api.InGameIncomeDTO;
import com.wordsmatry.domain.InGameIncome;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/10/04
 */
@Service
public class InGameIncomeMapper implements Mapper<InGameIncomeDTO, InGameIncome> {
	@Override
	public InGameIncome toEntity(InGameIncomeDTO api) {
		return InGameIncome.builder()
				.userId(api.getUserId())
				.dateTime(api.getDateTime())
				.eventType(api.getEventType())
				.incomeType(api.getIncomeType())
				.amountObtained(api.getAmountObtained())
				.currentBalance(api.getCurrentBalance())
				.build();
	}

	@Override
	public InGameIncomeDTO toApi(InGameIncome entity) {
		return InGameIncomeDTO.builder()
				.userId(entity.getUserId())
				.dateTime(entity.getDateTime())
				.eventType(entity.getEventType())
				.incomeType(entity.getIncomeType())
				.amountObtained(entity.getAmountObtained())
				.currentBalance(entity.getCurrentBalance())
				.build();
	}

	@Override
	public List<InGameIncome> toEntity(List<InGameIncomeDTO> apiList) {
		return apiList.stream().map(this::toEntity).toList();
	}

	@Override
	public List<InGameIncomeDTO> toApi(List<InGameIncome> entityList) {
		return entityList.stream().map(this::toApi).toList();
	}
}
