package com.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tblAccount")
public class Account {
	@Id
	private Integer account_id;
	private String acc_no;
	private String acc_type;

	@OneToOne(mappedBy = "account")
	Person person; //has-a relationship [hibernate association]
	
	public Account() {
		super();
	}

	public Account(Integer account_id, String acc_no, String acc_type) {
		super();
		this.account_id = account_id;
		this.acc_no = acc_no;
		this.acc_type = acc_type;
	}

	public Integer getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}

	public String getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(String acc_no) {
		this.acc_no = acc_no;
	}

	public String getAcc_type() {
		return acc_type;
	}

	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	

}
