package com.test;

public class Answer {
	private int id;
	private String answer;
	private String postedBy;

	public Answer(int id, String answer, String postedBy) {
		super();
		this.id = id;
		this.answer = answer;
		this.postedBy = postedBy;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", postedBy=" + postedBy + "]";
	}
}
