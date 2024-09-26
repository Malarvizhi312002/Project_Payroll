package com.example.demo;

public class Payslip {
	 private int empno;
	    private String name;
	    private double basicSalary;
	    private double hra;
	    private double da;
	    private double ta;
	    private double tax;
	    private double pf;
	    private double otherDeductions;
	    private double grossSalary;
	    private double netSalary;

	    public Payslip(int empno, String name, double basicSalary, double hra, double da, double ta, double tax, double pf, double otherDeductions, double grossSalary, double netSalary) {
	        this.empno = empno;
	        this.name = name;
	        this.basicSalary = basicSalary;
	        this.hra = hra;
	        this.da = da;
	        this.ta = ta;
	        this.tax = tax;
	        this.pf = pf;
	        this.otherDeductions = otherDeductions;
	        this.grossSalary = grossSalary;
	        this.netSalary = netSalary;
	    }

	    public String generateFormattedPayslip() {
	        return String.format(
	            "Earnings:\n" +
	            "Basic Salary:       %.2f\n" +
	            "House Rent Allowance (HRA):   %.2f\n" +
	            "Dearness Allowance (DA):   %.2f\n" +
	            "Travel Allowance (TA):  %.2f\n\n" +
	            "Deductions:\n" +
	            "Income Tax:         %.2f\n" +
	            "Provident Fund (PF):  %.2f\n" +
	            "Other deductions:    %.2f\n\n" +
	            "Net Pay (Take-home): %.2f",
	            basicSalary, hra, da, ta, tax, pf, otherDeductions, netSalary
	        );
	    }

		public int getEmpno() {
			return empno;
		}

		public void setEmpno(int empno) {
			this.empno = empno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getBasicSalary() {
			return basicSalary;
		}

		public void setBasicSalary(double basicSalary) {
			this.basicSalary = basicSalary;
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

		public double getOtherDeductions() {
			return otherDeductions;
		}

		public void setOtherDeductions(double otherDeductions) {
			this.otherDeductions = otherDeductions;
		}

		public double getGrossSalary() {
			return grossSalary;
		}

		public void setGrossSalary(double grossSalary) {
			this.grossSalary = grossSalary;
		}

		public double getNetSalary() {
			return netSalary;
		}

		public void setNetSalary(double netSalary) {
			this.netSalary = netSalary;
		}


}
