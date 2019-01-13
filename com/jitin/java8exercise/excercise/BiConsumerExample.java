package com.jitin.java8exercise.excercise;

import java.util.function.BiConsumer;

public class BiConsumerExample {
	public static void main(String[] args) {
		String[] students = { "Karan", "Vimal", "Madhu", "Avinash" };
		String studentToBeSearched = "Madhu";
		search(students, studentToBeSearched, (v, k) -> System.out.println(v.equalsIgnoreCase(k)));
	}

	private static void search(String[] students, String studentToBeSearched, BiConsumer<String, String> biConsumer) {
		for (String student : students) {
			biConsumer.accept(student, studentToBeSearched);
		}
	}
}
