package com.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tblPerson")
public class Person {

	@Id
	private Integer pid;
	private String p_name;
	private Integer p_age;

	@OneToOne
	@JoinColumn(name = "account_id")
	Account account; // has-a relation

	public Person() {
		super();
	}

	public Person(Integer pid, String p_name, Integer p_age, Account account) {
		super();
		this.pid = pid;
		this.p_name = p_name;
		this.p_age = p_age;
		this.account = account;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public Integer getP_age() {
		return p_age;
	}

	public void setP_age(Integer p_age) {
		this.p_age = p_age;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}