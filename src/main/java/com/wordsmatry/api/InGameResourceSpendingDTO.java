package com.wordsmatry.api;

import com.wordsmatry.domain.enumeration.EventType;
import com.wordsmatry.domain.enumeration.SpendingType;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/10/04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class InGameResourceSpendingDTO {
	String userId;
	Date dateTime;
	EventType eventType;
	SpendingType spendingType;
	Long amountSpent;
	BigDecimal currentBalance;
}
