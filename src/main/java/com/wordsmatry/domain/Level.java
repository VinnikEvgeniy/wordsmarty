package com.wordsmatry.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/06/21
 */
@Entity
@Table(name = "level")
public class Level {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column(name = "user_id")
	Long userId;
	@Column(name = "level_id")
	Long levelId;
	@Column(name = "chapter_id")
	Long chapterId;
	@Column(name = "field_id")
	Long fieldId;
	@Column(name = "letters_list")
	String lettersList;
	@Column(name = "crossword_words")
	String crosswordWords;
	@Column(name = "bonus_words")
	String bonusWords;
	@Column(name = "start_datetime")
	Date startDatetime;
	@Column(name = "end_datetime")
	Date endDatetime;
	@Column(name = "num_attempts")
	Long numAttempts;
	@Column(name = "num_shuffles")
	Long numShuffles;
	@Column(name = "num_bonus_words")
	Long numBonusWords;
	@Column(name = "num_lamps_used")
	Long numLampsUsed;
	@Column(name = "num_darts_used")
	Long numDartsUsed;
	@Column(name = "num_fireworks_used")
	Long numFireworksUsed;
	@Column(name = "new_cleverness_amount")
	String newClevernessAmount;
}
