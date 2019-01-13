package com.jitin.java8exercise.interfacewithdefaultmethods;

public class TestInterfaceWithDefaultMethod implements InterfaceWithDefaultMethods1 {

	@Override
	public void sayHello(String msg) {
		System.out.println("Hello from implemented method of interface "+msg);
	}

	public static void main(String[] args) {
		InterfaceWithDefaultMethods1.staticMethod();
		InterfaceWithDefaultMethods1 interfaceWithDefaultMethods=new TestInterfaceWithDefaultMethod();
		interfaceWithDefaultMethods.sayHello("1");
		interfaceWithDefaultMethods.defaultMethod();
		
	}
}
