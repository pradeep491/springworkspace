package com.test;

import java.util.List;

public class Question {
	private int id;
	private String qname;
	private List<Answer> answers;

	public Question(int id, String qname, List<Answer> answers) {
		super();
		this.id = id;
		this.qname = qname;
		this.answers = answers;
	}

	public void show() {
		System.out.println("question id-"+id);
		System.out.println("Question Name-"+qname);
		System.out.println("Answers are-");
		answers.stream().forEach(c->System.out.println(c));
	}
}
