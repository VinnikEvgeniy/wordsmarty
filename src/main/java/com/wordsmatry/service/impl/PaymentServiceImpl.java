package com.wordsmatry.service.impl;

import com.wordsmatry.api.PaymentDTO;
import com.wordsmatry.mapper.PaymentMapper;
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
	private PaymentRepository paymentRepository;
	@Autowired
	private PaymentMapper paymentMapper;

	@Override
	public void save(PaymentDTO payment) {
		paymentRepository.save(paymentMapper.toEntity(payment));
	}

	@Override
	public void delete(Long id) {
		paymentRepository.deleteById(id);
	}

	@Override
	public PaymentDTO findById(Long id) {
		return paymentMapper.toApi(paymentRepository.findById(id).orElseThrow());
	}

	@Override
	public List<PaymentDTO> findAll() {
		return paymentMapper.toApi(paymentRepository.findAll());
	}
}