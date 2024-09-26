package com.example.demo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="Employ")
public class Employ {
	
	@Id
	@Column(name = "emp_no")
	private int empno;
	@Column(name = "name")
	private String name;
	@Column(name = "username")
	private String username;
	@Column(name = "passwordd")
	private String password;
	@Column(name = "gender")
	private String gender;
	@Column(name = "dept")
	private String dept;
	@Column(name = "desig")
	private String desig;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_of_join")
	private Date dateOfJoin;
	@Column(name = "salary")
	private double salary;
	@Column(name = "leave_available")
	private String leaveAvailable;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Date getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getLeaveAvailable() {
		return leaveAvailable;
	}
	public void setLeaveAvailable(String leaveAvailable) {
		this.leaveAvailable = leaveAvailable;
	}
	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employ(int empno, String name, String username, String password, String gender, String dept, String desig,
			Date dateOfBirth, Date dateOfJoin, double salary, String leaveAvailable) {
		super();
		this.empno = empno;
		this.name = name;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.dept = dept;
		this.desig = desig;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoin = dateOfJoin;
		this.salary = salary;
		this.leaveAvailable = leaveAvailable;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", gender=" + gender + ", dept=" + dept + ", desig=" + desig + ", dateOfBirth=" + dateOfBirth
				+ ", dateOfJoin=" + dateOfJoin + ", salary=" + salary + ", leaveAvailable=" + leaveAvailable + "]";
	}
	
}
