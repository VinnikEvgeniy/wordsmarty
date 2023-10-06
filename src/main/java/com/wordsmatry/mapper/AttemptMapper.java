package com.wordsmatry.mapper;

import com.wordsmatry.api.AttemptDTO;
import com.wordsmatry.domain.Attempt;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/10/04
 */
@Service
public class AttemptMapper implements Mapper<AttemptDTO, Attempt> {
	@Override
	public Attempt toEntity(AttemptDTO api) {
		return Attempt.builder()
				.userId(api.getUserId())
				.dateTime(api.getDateTime())
				.levelId(api.getLevelId())
				.attemptWord(api.getAttemptWord())
				.bonusWord(api.getBonusWord())
				.crosswordSuccess(api.getCrosswordSuccess())
				.build();
	}

	@Override
	public AttemptDTO toApi(Attempt entity) {
		return AttemptDTO.builder()
				.userId(entity.getUserId())
				.dateTime(entity.getDateTime())
				.levelId(entity.getLevelId())
				.attemptWord(entity.getAttemptWord())
				.bonusWord(entity.getBonusWord())
				.crosswordSuccess(entity.getCrosswordSuccess())
				.build();
	}

	@Override
	public List<Attempt> toEntity(List<AttemptDTO> apiList) {
		return apiList.stream().map(this::toEntity).toList();
	}

	@Override
	public List<AttemptDTO> toApi(List<Attempt> entityList) {
		return entityList.stream().map(this::toApi).toList();
	}
}
