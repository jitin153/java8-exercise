package com.jitin.java8exercise.interfacewithdefaultmethods;

@FunctionalInterface
public interface InterfaceWithDefaultMethods2 {
	public void sayHello(String msg);

	public default void defaultMethod() {
		System.out.println("Default method from interface2 executed!");
	}
	public static void staticMethod() {
		System.out.println("Static method from interface2 executed!");
	}
}
