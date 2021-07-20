package com.vg.springbootdemo.model;

import java.util.Date;

public class FullResponse extends Response {

	
	private Date date;
	
	public FullResponse(String status, Date date) {
		super(status);
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
