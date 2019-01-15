package com.jitin.java8exercise.streams;

import java.util.Arrays;
import java.util.List;

import com.jitin.java8exercise.common.Employee;

public class StreamsExample {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, "Rohit", 45000), new Employee(2, "Bhavna", 35000),
				new Employee(3, "Basant", 37000), new Employee(4, "Gagan", 35500));
		System.out.println("Print all employee using stream");
		employees.stream().forEach(System.out::println);
		System.out.println("\nPrint employees whose name starts with B using stream & filter");
		employees.stream().filter(emp -> emp.getName().startsWith("B")).forEach(System.out::println);
		System.out.println("\nPrint employees whose salary is greater than 35000 using stream & filter");
		employees.stream().filter(emp -> emp.getSalary() > 35000).forEach(System.out::println);
		System.out.println("\nCount employees whose salary is less than 38000 using stream & filter");
		Long count=employees.stream().filter(emp -> emp.getSalary() <38000).count();
		System.out.println(count);
		
		//--Parallel Streams
		System.out.println("\nPrint employees whose id is greater than 1 & less than 4 using parallelStream & filter");
		employees.parallelStream().filter(emp -> emp.getId()>1 && emp.getId()<4).forEach(System.out::println);
	}
}
