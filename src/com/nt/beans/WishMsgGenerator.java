package com.nt.beans;

import java.util.Date;

public class WishMsgGenerator {
	
	private String name;
	private Date date;
	
	public WishMsgGenerator() {
		System.out.println(" 0- param constructor spring bean class");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public WishMsgGenerator(String name, Date date) {
		super();
		this.name = name;
		this.date = date;
	}

	// business logic
	public String generateMsg() {
		return "Hi "+name+" : "+date;
	}

}
