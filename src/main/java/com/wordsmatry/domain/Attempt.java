package com.wordsmatry.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/06/21
 */
@Entity
@Table(name = "attempt")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Attempt {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column(name = "user_id")
	String userId;

	@Column(name = "date_time")
	Date dateTime;

	@Column(name = "level_id")
	Long levelId;

	@Column(name = "attempt_word")
	int attemptWord;

	@Column(name = "bonus_word")
	int bonusWord;

	@Column(name = "crossword_success")
	int crosswordSuccess;
}
