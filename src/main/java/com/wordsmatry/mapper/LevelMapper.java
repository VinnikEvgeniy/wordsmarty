package com.wordsmatry.mapper;

import com.wordsmatry.api.LevelDTO;
import com.wordsmatry.domain.Level;
import com.wordsmatry.domain.record.Bonus;
import com.wordsmatry.util.StringUtil;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class LevelMapper implements Mapper<LevelDTO, Level> {
	@Override
	public Level toEntity(LevelDTO levelDTO) {
		return Level.builder()
				.levelId(levelDTO.getLevelId())
				.userId(levelDTO.getUserId())
				.letters(levelDTO.getLetters())
				.chapterName(levelDTO.getChapterName())
				.words(StringUtil.toJson(levelDTO.getWords()))
				.bonusWords(StringUtil.toJson(levelDTO.getBonusWords()))
				.startDatetime(levelDTO.getStartDatetime())
				.endDatetime(levelDTO.getEndDatetime())
				.bonus(StringUtil.toJson(levelDTO.getBonus()))
				.build();
	}

	@Override
	public LevelDTO toApi(Level level) {
		return LevelDTO.builder()
				.levelId(level.getLevelId())
				.userId(level.getUserId())
				.chapterName(level.getChapterName())
				.words(StringUtil.toPojo(level.getWords(), List.class))
				.bonusWords(StringUtil.toPojo(level.getBonusWords(), List.class))
				.startDatetime(level.getStartDatetime())
				.endDatetime(level.getEndDatetime())
				.bonus(StringUtil.toPojo(level.getBonus(), Bonus.class))
				.build();
	}

	@Override
	public List<Level> toEntity(List<LevelDTO> levelDTOs) {
		return levelDTOs.stream().map(this::toEntity).toList();
	}

	@Override
	public List<LevelDTO> toApi(List<Level> levels) {
		return levels.stream().map(this::toApi).toList();
	}
}
