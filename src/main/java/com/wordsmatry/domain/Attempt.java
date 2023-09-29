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
@Table(name = "attempt")
public class Attempt {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column(name = "user_id")
	int userId;

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

	public Attempt() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public Long getLevelId() {
		return levelId;
	}

	public void setLevelId(Long levelId) {
		this.levelId = levelId;
	}

	public int getAttemptWord() {
		return attemptWord;
	}

	public void setAttemptWord(int attemptWord) {
		this.attemptWord = attemptWord;
	}

	public int getBonusWord() {
		return bonusWord;
	}

	public void setBonusWord(int bonusWord) {
		this.bonusWord = bonusWord;
	}

	public int getCrosswordSuccess() {
		return crosswordSuccess;
	}

	public void setCrosswordSuccess(int crosswordSuccess) {
		this.crosswordSuccess = crosswordSuccess;
	}
}
