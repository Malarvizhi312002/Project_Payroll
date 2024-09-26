package com.example.demo;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Payment")
public class Payment {
	@Id
    @Column(name = "payment_id")
    private int paymentId;

    @Column(name = "emp_id")
    private int empId;

    @Column(name = "pay_date")
    private Date payDate;

    @Column(name = "hra")
    private double hra;

    @Column(name = "da")
    private double da;

    @Column(name = "ta")
    private double ta;

    @Column(name = "tax")
    private double tax;

    @Column(name = "pf")
    private double pf;

    @Column(name = "gross")
    private double gross;

    @Column(name = "take_home")
    private double takeHome;

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getTa() {
		return ta;
	}

	public void setTa(double ta) {
		this.ta = ta;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getGross() {
		return gross;
	}

	public void setGross(double gross) {
		this.gross = gross;
	}

	public double getTakeHome() {
		return takeHome;
	}

	public void setTakeHome(double takeHome) {
		this.takeHome = takeHome;
	}
	
	public Payment() {
		
	}

	public Payment(int paymentId, int empId, Date payDate, double hra, double da, double ta, double tax, double pf,
			double gross, double takeHome) {
		super();
		this.paymentId = paymentId;
		this.empId = empId;
		this.payDate = payDate;
		this.hra = hra;
		this.da = da;
		this.ta = ta;
		this.tax = tax;
		this.pf = pf;
		this.gross = gross;
		this.takeHome = takeHome;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", empId=" + empId + ", payDate=" + payDate + ", hra=" + hra
				+ ", da=" + da + ", ta=" + ta + ", tax=" + tax + ", pf=" + pf + ", gross=" + gross + ", takeHome="
				+ takeHome + "]";
	}

}
