package com.zhangwen.common.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class TPS {

	private BigInteger id;
	
	private String name;
	
	private int age;
	
	private BigDecimal qian;
	
	private Date date;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BigDecimal getQian() {
		return qian;
	}

	public void setQian(BigDecimal qian) {
		this.qian = qian;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public TPS(BigInteger id, String name, int age, BigDecimal qian, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.qian = qian;
		this.date = date;
	}

	@Override
	public String toString() {
		return "TPS [id=" + id + ", name=" + name + ", age=" + age + ", qian=" + qian + ", date=" + date + "]";
	}

	public TPS() {
		super();
	}
	
}
