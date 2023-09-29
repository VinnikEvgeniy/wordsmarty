package com.wordsmatry.domain;

import com.wordsmatry.domain.enumeration.EventType;
import com.wordsmatry.domain.enumeration.SpendingType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/06/21
 */
@Entity
@Table(name = "in_game_resource_spending")
public class InGameResourceSpending {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column(name = "user_id")
	int userId;

	@Column(name = "date_time")
	Date dateTime;

	@Column(name = "event_type")
	EventType eventType;

	@Column(name = "spending_type")
	SpendingType spendingType;

	@Column(name = "amount_spent")
	Long amountSpent;

	@Column(name = "current_balance")
	BigDecimal currentBalance;
}
