package com.hibernate.entity;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tbluser")
public class User {

	@Id
	private Integer uid;
	private String uname;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "userphone",
	joinColumns = { @JoinColumn(name = "uid") }, 
	inverseJoinColumns = { @JoinColumn(name = "pid") })
	
	private Set<PhoneNo> phoneNos;

	public User() {
		super();
	}

	public User(Integer uid, String uname, Set<PhoneNo> phoneNos) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.phoneNos = phoneNos;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Set<PhoneNo> getPhoneNos() {
		return phoneNos;
	}

	public void setPhoneNos(Set<PhoneNo> phoneNos) {
		this.phoneNos = phoneNos;
	}

}