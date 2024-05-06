package com.test;

import java.util.Map;
import java.util.Map.Entry;

public class Question {
	private int id;
	private String qName;
	private Map<Answer, User> answers;

	public Question(int id, String qName, Map<Answer, User> answers) {
		super();
		this.id = id;
		this.qName = qName;
		this.answers = answers;
	}

	public void show() {
		System.out.println("Question id-" + id);
		System.out.println("Question Name-" + qName);
		for (Map.Entry<Answer, User> entry : answers.entrySet()) {
			System.out.println("Answer is-" + entry.getKey() + " posted by-" + entry.getValue());
		}
		System.out.println("======================");
		answers.forEach((k, v) -> System.out.println("Key::: " + k + ": Value::: " + v));
	}
}
