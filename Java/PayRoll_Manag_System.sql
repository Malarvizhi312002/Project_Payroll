create database payroll_manag;

use payroll_manag;

CREATE TABLE Employ (
    emp_no INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    gender CHAR(50),
    dept VARCHAR(50),
    desig VARCHAR(50),
    date_of_birth DATE,
    date_of_join DATE,
    salary DECIMAL(10,2),
    leave_available CHAR(50)
);

INSERT INTO Employ (emp_no,name,gender,dept,desig,date_of_birth,date_of_join,salary,leave_available)
Values
(1,'Aryan Prasath','Male','Business Administration','Developer','1996-09-12','2018-12-12',56000,'Yes'),
(2,'Prathap kumar','Male','Security','Tester','1998-01-19','2021-02-09',36000,'Yes'),
(3,'Kanya','Female','Networking','Developer','2000-08-21','2022-11-29',45000,'Yes'),
(4,'Shalini','Female','Programming','Manager','1992-10-11','2018-05-12',150000,'N0'),
(5,'Sheela','Female','Software Development','Developer','1995-12-06','2017-12-01',100000,'Yes'),
(6,'Prakash','Male','Software Development','Developer','1997-02-28','2019-08-12',56000,'No'),
(7,'Adharva','Male','Project Management','Manager','1991-09-12','2013-12-12',200000,'Yes');

CREATE TABLE Attendance(
      employ_id INT,
      no_of_working_days INT,
      no_of_days_present INT,
      no_of_days_absent INT,
      FOREIGN KEY (employ_id) REFERENCES Employ(emp_no)
      );
      
      INSERT INTO Attendance ( employ_id,  no_of_working_days, no_of_days_present, no_of_days_absent)
	  VALUES
      (1, 26, 24, 2),
      (2, 26, 25, 1),
      (3, 26, 22, 4),
      (4, 26, 26, 0),
      (5, 26, 23, 3),
      (6, 26, 26, 0),
      (7, 26, 24, 2);
      
      drop table if exists Payment;
      
      CREATE TABLE Payment (
    Payment_Id INT PRIMARY KEY AUTO_INCREMENT,
    emp_id INT,
    pay_date DATE,
    hra DECIMAL(10,2),
    da DECIMAL(10,2),
    ta DECIMAL(10,2),
    tax DECIMAL(10,2),
    pf DECIMAL(10,2),
    gross DECIMAL(10,2),
    take_home DECIMAL(10,2),
    FOREIGN KEY (emp_id) REFERENCES Employ(emp_no)
);

INSERT INTO Payment (emp_id,pay_date, hra,  da, ta, tax, pf , gross, take_home)
VALUES
(1, '2024-08-01', 5000.00, 3000.00, 2000.00, 1500.00, 1000.00, 61000.00, 59000.00),
(2, '2024-08-01', 4000.00, 2500.00, 1500.00, 1200.00, 900.00, 43000.00, 41800.00),
(3, '2024-08-01', 4500.00, 2700.00, 1800.00, 1300.00, 950.00, 52250.00, 51000.00),
(4, '2024-08-01', 10000.00, 7000.00, 5000.00, 4000.00, 3500.00, 179500.00, 175000.00),
(5, '2024-08-01', 9000.00, 6000.00, 4000.00, 3000.00, 2500.00, 125000.00, 120500.00),
(6, '2024-08-01', 5000.00, 3500.00, 2500.00, 1800.00, 1400.00, 64200.00, 62800.00),
(7, '2024-08-01', 15000.00, 10000.00, 7000.00, 5000.00, 4500.00, 231500.00, 226000.00);


Create TABLE Admin(
      admin_id INT PRIMARY KEY AUTO_INCREMENT,
	  name varchar(30),
	  email varchar(30),
      password varchar(200)
      );
      

Describe  Employ;

Describe Attendance;

Describe Payment;

Select * from Employ;

Select * from Attendance;

Select * from Payment;

