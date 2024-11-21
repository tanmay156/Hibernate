package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbStudent")
public class Student {

	@Id
	@Column(name = "stud_roll")
	private int roll;
	@Column(name = "stud_name", unique = true, nullable = false, length = 100)
	private String name;
	@Column(name = "stud_percentage", nullable = false)
	private float percent;

	public Student() {
		super();
	}

	public Student(int roll, String name, float percent) {
		super();
		this.roll = roll;
		this.name = name;
		this.percent = percent;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercent() {
		return percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}

}
