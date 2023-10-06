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
@Table(name = "payment")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column(name = "user_id")
	String userId;

	@Column(name = "date_time")
	Date dateTime;

	@Column(name = "item_id")
	int itemId;

	@Column(name = "purchase_placement")
	String purchasePlacement;

	@Column(name = "local_currency")
	String localCurrency;

	@Column(name = "price_in_local_currency")
	String priceInLocalCurrency;

	@Column(name = "price_in_usd")
	String priceInUsd;

	@Column(name = "payment_confirmed")
	String paymentConfirmed;

	@Column(name = "num_coins")
	Long numCoins;

	@Column(name = "num_lamps")
	Long numLamps;

	@Column(name = "num_darts")
	Long numDarts;

	@Column(name = "num_fireworks")
	Long numFireworks;

	@Column(name = "is_sale_item")
	Boolean isSaleItem;
}