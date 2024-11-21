package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees_Table")
public class Employee2 {

	@Id
	private Integer Employee_Id;
	@Column(name = "Employee_Name")
	private String name;
	@Column(name = "Employee_Position")
	private String position;
	@Column(name = "Employee_Salary")
	private Double salary;

	public Employee2() {
		super();
	}

	public Employee2(Integer Employee_Id, String name, String position, Double salary) {
		super();
		this.Employee_Id = Employee_Id;
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	public Integer getEmployee_Id() {
		return Employee_Id;
	}

	public void setEmployee_Id(Integer eid) {
		this.Employee_Id = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}