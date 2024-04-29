package com.test;

import java.util.Date;

public class Answer {
	private int id;
	private String ansname;
	private Date postedDate;

	public Answer(int id, String ansname, Date postedDate) {
		super();
		this.id = id;
		this.ansname = ansname;
		this.postedDate = postedDate;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", ansname=" + ansname + ", postedDate=" + postedDate + "]";
	}
}
