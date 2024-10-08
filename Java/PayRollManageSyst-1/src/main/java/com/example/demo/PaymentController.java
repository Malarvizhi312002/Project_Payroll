package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	
	@Autowired
    private PaymentService paymentService;
	
    @GetMapping(value="/generatePayslip/{empId}")
    public List<Payment> generatePayslip(@PathVariable int empId) {
        return paymentService.getPaymentDetails(empId);
    }

}
