package com.jitin.java8exercise.interfacewithdefaultmethods;

@FunctionalInterface
public interface InterfaceWithDefaultMethods1 {
	public void sayHello(String msg);

	public default void defaultMethod() {
		System.out.println("Default method from interface1 executed!");
	}
	public static void staticMethod() {
		System.out.println("Static method from interface1 executed!");
	}
}
