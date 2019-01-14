package com.jitin.java8exercise.exceptionhandling;

import java.util.function.BiConsumer;

public class ExceptionHandlingUsingLambda {

	public static void main(String[] args) {
		// --Divide properly
		calculate(20, 5, (v, k) -> {
			try {
				System.out.println("Division is : " + (v / k));
			} catch (ArithmeticException e) {
				System.out.println("Couldn't divide by zero!");
			}
		});
		// --Divide by zero
		calculate(20, 0, (v, k) -> {
			try {
				System.out.println("Division is : " + (v / k));
			} catch (ArithmeticException e) {
				System.out.println("Couldn't divide by zero!");
			}
		});
		// --Perform addition
		calculate(20, 5, (v, k) -> {
			try {
				System.out.println("Addition is : " + (v + k));
			} catch (ArithmeticException e) {
				System.out.println("Couldn't divide by zero!");
			}
		});
	}

	private static void calculate(int firstNumber, int secondNumber, BiConsumer<Integer, Integer> biConsumer) {
		biConsumer.accept(firstNumber, secondNumber);
	}
}
