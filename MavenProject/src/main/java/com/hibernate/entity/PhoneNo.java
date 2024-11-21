package com.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblphone")
public class PhoneNo {

	@Id
	private Integer pid;
	private String pname;
	private String type;

	public PhoneNo() {
		super();
	}

	public PhoneNo(Integer pid, String pname, String type) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.type = type;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}