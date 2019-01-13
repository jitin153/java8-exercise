package com.jitin.java8exercise.excercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseUsingJava7 {

	private static void sortByName(List<Employee> employees) {
		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				return emp1.getName().compareTo(emp2.getName());
			}
		});
	}

	private static void printEmployeesNameStartsWithB(List<Employee> employees) {
		for (Employee emp : employees) {
			if (emp.getName().startsWith("B")) {
				System.out.println(emp);
			}
		}
	}

	private static void printConditionally(List<Employee> employees, Condition condition) {
		for (Employee emp : employees) {
			if (condition.test(emp)) {
				System.out.println(emp);
			}
		}
	}

	private static void printAll(List<Employee> employees) {
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, "Rohit", 45000), new Employee(2, "Bhavna", 35000),
				new Employee(3, "Basant", 37000), new Employee(4, "Gagan", 35500), new Employee(5, "Gunjan", 33000),
				new Employee(6, "Rakul", 25000), new Employee(7, "Aman", 41000), new Employee(8, "Vinay", 38000));
		sortByName(employees);
		System.out.println("All employees after sorting");
		printAll(employees);
		System.out.println("\nName starts with B");
		printEmployeesNameStartsWithB(employees);
		System.out.println("\nName starts with G");
		printConditionally(employees, new Condition() {

			@Override
			public boolean test(Employee employee) {
				return employee.getName().startsWith("G");
			}
		});
		System.out.println("\nName starts with R");
		printConditionally(employees, new Condition() {

			@Override
			public boolean test(Employee employee) {
				return employee.getName().startsWith("R");
			}
		});
		System.out.println("\nSalary greater than 35000");
		printConditionally(employees, new Condition() {

			@Override
			public boolean test(Employee employee) {
				return employee.getSalary() > 35000;
			}
		});
	}

}

interface Condition {
	boolean test(Employee employee);
}
