package com.wordsmatry.service;

import com.wordsmatry.api.PaymentDTO;
import java.util.List;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
public interface PaymentService {
	void save(PaymentDTO paymentDTO);

	void delete(Long id);

	PaymentDTO findById(Long id);

	List<PaymentDTO> findAll();
}
