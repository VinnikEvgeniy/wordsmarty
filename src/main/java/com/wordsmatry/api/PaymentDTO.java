package com.wordsmatry.api;

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
public class PaymentDTO {
	String userId;
	Date dateTime;
	int itemId;
	String purchasePlacement;
	String localCurrency;
	String priceInLocalCurrency;
	String priceInUsd;
	String paymentConfirmed;
	Long numCoins;
	Long numLamps;
	Long numDarts;
	Long numFireworks;
	Boolean isSaleItem;
}
