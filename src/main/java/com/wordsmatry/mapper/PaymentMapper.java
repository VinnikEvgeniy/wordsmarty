package com.wordsmatry.mapper;

import com.wordsmatry.api.PaymentDTO;
import com.wordsmatry.domain.Payment;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/10/04
 */
@Service
public class PaymentMapper implements Mapper<PaymentDTO, Payment> {
	@Override
	public Payment toEntity(PaymentDTO api) {
		return Payment.builder()
				.userId(api.getUserId())
				.dateTime(api.getDateTime())
				.itemId(api.getItemId())
				.purchasePlacement(api.getPurchasePlacement())
				.localCurrency(api.getLocalCurrency())
				.priceInLocalCurrency(api.getPriceInLocalCurrency())
				.priceInUsd(api.getPriceInUsd())
				.paymentConfirmed(api.getPaymentConfirmed())
				.numCoins(api.getNumCoins())
				.numLamps(api.getNumLamps())
				.numDarts(api.getNumDarts())
				.numFireworks(api.getNumFireworks())
				.isSaleItem(api.getIsSaleItem())
				.build();
	}

	@Override
	public PaymentDTO toApi(Payment entity) {
		return PaymentDTO.builder()
				.userId(entity.getUserId())
				.dateTime(entity.getDateTime())
				.itemId(entity.getItemId())
				.purchasePlacement(entity.getPurchasePlacement())
				.localCurrency(entity.getLocalCurrency())
				.priceInLocalCurrency(entity.getPriceInLocalCurrency())
				.priceInUsd(entity.getPriceInUsd())
				.paymentConfirmed(entity.getPaymentConfirmed())
				.numCoins(entity.getNumCoins())
				.numLamps(entity.getNumLamps())
				.numDarts(entity.getNumDarts())
				.numFireworks(entity.getNumFireworks())
				.isSaleItem(entity.getIsSaleItem())
				.build();
	}

	@Override
	public List<Payment> toEntity(List<PaymentDTO> apiList) {
		return apiList.stream().map(this::toEntity).toList();
	}

	@Override
	public List<PaymentDTO> toApi(List<Payment> entityList) {
		return entityList.stream().map(this::toApi).toList();
	}
}
