package com.jitin.java8exercise.excercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExerciseUsingJava8 {

	private static void sortByName(List<Employee> employees) {
		Collections.sort(employees, (emp1, emp2) -> emp1.getName().compareTo(emp2.getName()));
	}

	private static void printConditionally(List<Employee> employees, Condition condition) {
		employees.forEach(emp -> {
			if (condition.test(emp)) {
				System.out.println(emp);
			}
		});
	}

	/*private static void printAll(List<Employee> employees) {
		employees.forEach(System.out::println);
	}*/

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, "Rohit", 45000), new Employee(2, "Bhavna", 35000),
				new Employee(3, "Basant", 37000), new Employee(4, "Gagan", 35500), new Employee(5, "Gunjan", 33000),
				new Employee(6, "Rakul", 25000), new Employee(7, "Aman", 41000), new Employee(8, "Vinay", 38000));
		sortByName(employees);
		System.out.println("All employees after sorting");
		//printAll(employees);
		printConditionally(employees,emp->true);
		System.out.println("\nName starts with G");
		printConditionally(employees, emp -> emp.getName().startsWith("G"));
		System.out.println("\nName starts with R");
		printConditionally(employees, emp -> emp.getName().startsWith("R"));
		System.out.println("\nSalary greater than 35000");
		printConditionally(employees, emp -> emp.getSalary() > 35000);
	}

}

// --Showing error because already defined in ExcerciseUsingJava7.java
/*
 * interface Condition { boolean test(Employee employee); }
 */
