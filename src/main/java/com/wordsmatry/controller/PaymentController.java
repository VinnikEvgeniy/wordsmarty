package com.wordsmatry.controller;

import com.wordsmatry.core.constant.ApiEndpoint;
import com.wordsmatry.domain.Payment;
import com.wordsmatry.service.PaymentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
@RestController
@RequestMapping(value = ApiEndpoint.PAYMENT, produces = {MediaType.APPLICATION_JSON_VALUE})
public class PaymentController {
	@Autowired
	PaymentService paymentService;

	@PostMapping(ApiEndpoint.CREATE)
	public void createPayment(@RequestBody Payment payment) {
		paymentService.save(payment);
	}

	@DeleteMapping(ApiEndpoint.DELETE)
	public void deletePayment(@PathVariable Long id) {
		paymentService.delete(id);
	}

	@GetMapping(ApiEndpoint.FIND_BY_ID)
	public Payment getPaymentById(@PathVariable Long id) {
		return paymentService.findById(id);
	}

	@GetMapping(ApiEndpoint.FIND_ALL)
	public List<Payment> getAllPayments() {
		return paymentService.findAll();
	}

}