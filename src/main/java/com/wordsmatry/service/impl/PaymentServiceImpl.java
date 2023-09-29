package com.wordsmatry.service.impl;

import com.wordsmatry.domain.Payment;
import com.wordsmatry.repository.PaymentRepository;
import com.wordsmatry.service.PaymentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	PaymentRepository paymentRepository;

	@Override
	public void save(Payment payment) {
		paymentRepository.save(payment);
	}

	@Override
	public void delete(Long id) {
		paymentRepository.deleteById(id);
	}

	@Override
	public Payment findById(Long id) {
		return paymentRepository.findById(id).orElseThrow();
	}

	@Override
	public List<Payment> findAll() {
		return paymentRepository.findAll();
	}
}
