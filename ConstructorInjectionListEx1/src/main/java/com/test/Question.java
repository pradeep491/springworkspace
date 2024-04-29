package com.test;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String name;
	private List<String> answers;

	public Question(int id, String name, List<String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void show() {
		System.out.println("Question id-" + id);
		System.out.println("Question Name-" + name);
		/*Iterator<String> itr = answers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		answers.stream().forEach(c->System.out.println(c));
	}
}
