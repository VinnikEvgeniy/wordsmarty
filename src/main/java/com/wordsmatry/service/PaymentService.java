package com.wordsmatry.service;

import com.wordsmatry.domain.Account;
import com.wordsmatry.domain.Payment;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
public interface PaymentService {
	void save(Payment payment);

	void delete(Long id);

	Payment findById(Long id);

	List<Payment> findAll();
}
