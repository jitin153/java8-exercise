package com.jitin.java8exercise.interfacewithdefaultmethods;

public class TestMultipleInheritance implements InterfaceWithDefaultMethods1, InterfaceWithDefaultMethods2 {

	@Override
	public void defaultMethod() {
		InterfaceWithDefaultMethods1.super.defaultMethod();
		InterfaceWithDefaultMethods2.super.defaultMethod();
	}

	@Override
	public void sayHello(String msg) {
		System.out.println("Hello from interface "+msg);

	}

	public static void main(String[] args) {
		InterfaceWithDefaultMethods1.staticMethod();
		InterfaceWithDefaultMethods2.staticMethod();
		InterfaceWithDefaultMethods1 interfaceWithDefaultMethods1=new TestMultipleInheritance();
		interfaceWithDefaultMethods1.sayHello("1");
		InterfaceWithDefaultMethods2 interfaceWithDefaultMethods2=new TestMultipleInheritance();
		interfaceWithDefaultMethods2.sayHello("2");
		
		TestMultipleInheritance testMultipleInheritance=new TestMultipleInheritance();
		testMultipleInheritance.defaultMethod();
		//testMultipleInheritance.sayHello("hehe");
	}
}
