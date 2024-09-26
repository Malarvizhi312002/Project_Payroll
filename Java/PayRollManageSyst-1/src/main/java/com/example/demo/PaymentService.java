package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	
	@Autowired
    private PaymentRepository paymentRepository;

    // Method to get payment details for a specific employee
    public List<Payment> getPaymentDetails(int empId) {
        return paymentRepository.findByEmpId(empId);
    }

}
