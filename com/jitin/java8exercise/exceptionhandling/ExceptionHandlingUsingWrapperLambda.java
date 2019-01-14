package com.jitin.java8exercise.exceptionhandling;

import java.util.function.BiConsumer;

public class ExceptionHandlingUsingWrapperLambda {
	public static void main(String[] args) {
		// --Divide properly
		calculate(20, 5, wrapperLambda((v, k) -> System.out.println("Division is : " + (v / k))));
		// --Divide by zero
		calculate(20, 0, wrapperLambda((v, k) -> System.out.println("Division is : " + (v / k))));
		// --Perform addition
		calculate(20, 5, wrapperLambda((v, k) -> System.out.println("Addition is : " + (v + k))));
	}

	private static void calculate(int firstNumber, int secondNumber, BiConsumer<Integer, Integer> biConsumer) {
		biConsumer.accept(firstNumber, secondNumber);
	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
		return (v, k) -> {
			try {
				biConsumer.accept(v, k);
			} catch (ArithmeticException e) {
				System.out.println("Exception occurred!");
			}
		};
	}
}
