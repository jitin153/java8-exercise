package com.jitin.java8exercise.Lambda.functionalinterface;

@FunctionalInterface
public interface Greeter {
	public void greet();

	// --Functional interface can have only one non static abstract method.
	// public void sayHello();

	// --We can have static methods in functional interface.
	public static void hello() {
		System.out.println("Hello from functional interface static method!");
	}

	// --We can have default methods in functional interface.
	public default void hello2() {
		System.out.println("Hello from functional interface default method!");
	}
}
