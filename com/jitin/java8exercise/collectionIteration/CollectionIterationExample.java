package com.jitin.java8exercise.collectionIteration;

import java.util.Arrays;
import java.util.List;

import com.jitin.java8exercise.common.Employee;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, "Rohit", 45000), new Employee(2, "Bhavna", 35000),
				new Employee(3, "Basant", 37000), new Employee(4, "Gagan", 35500));
		
		//--Before Java-8
		System.out.println("Before Java - 8 :: Using for loop");
		for(int i=0;i<employees.size();i++) {
			System.out.println(employees.get(i));
		}
		System.out.println("\nBefore Java - 8 :: Using for each loop");
		for(Employee emp:employees) {
			System.out.println(emp);
		}
		//--Using Java-8
		System.out.println("\nJava - 8 forEach");
		employees.forEach(emp->System.out.println(emp));
		//--Using Method reference
		System.out.println("\nJava - 8 forEach & method reference");
		employees.forEach(System.out::println);
	}

}
