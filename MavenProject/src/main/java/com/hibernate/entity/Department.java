package com.hibernate.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Department_Table")
public class Department {

	@Id
	private Integer Department_Id;
	@Column(name = "Department_Name")
	private String dname;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "departmentEmployees", joinColumns = {
			@JoinColumn(name = "Department_Id") }, inverseJoinColumns = { @JoinColumn(name = "Employee_Id") })
	Set<Employee2> employee2;

	public Integer getDepartment_Id() {
		return Department_Id;
	}

	public void setDepartment_Id(Integer department_Id) {
		Department_Id = department_Id;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Set<Employee2> getEmployee2() {
		return employee2;
	}

	public void setEmployee2(Set<Employee2> employee2) {
		this.employee2 = employee2;
	}

	public Department(Integer department_Id, String dname, Set<Employee2> employee2) {
		super();
		Department_Id = department_Id;
		this.dname = dname;
		this.employee2 = employee2;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}