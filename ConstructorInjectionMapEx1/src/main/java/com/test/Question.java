package com.test;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;
	private String qName;
	private Map<String, String> answers;

	public Question(int id, String qName, Map<String, String> answers) {
		super();
		this.id = id;
		this.qName = qName;
		this.answers = answers;
	}

	public void show() {
		System.out.println("Question Id-" + id);
		System.out.println("Question Name-" + qName);
		Set<Entry<String, String>> set = answers.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<String, String> e = itr.next();
			System.out.println("Answer:" + e.getKey() + " - Posted by:" + e.getValue());
		}
		System.out.println("====================");
		System.out.println("on java10+");
		for (var entry : answers.entrySet()) {
			System.out.println(entry.getKey() + "||||" + entry.getValue());
		}
		System.out.println("====================");
		answers.forEach((k, v) -> System.out.println("Key::: " + k + ": Value::: " + v));
		System.out.println("====================");
		for (Map.Entry<String, String> m : answers.entrySet()) {
			System.out.println(m.getKey() + "----" + m.getValue());
		}
	}
}
