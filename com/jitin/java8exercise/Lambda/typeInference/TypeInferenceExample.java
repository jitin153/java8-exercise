package com.jitin.java8exercise.Lambda.typeInference;

public class TypeInferenceExample {

	public static void printLambdaResult(StringLengthLambda s) {
		System.out.println(s.getLength("Method outside main"));
	}
	public static void main(String[] args) {
		StringLengthLambda stringLength1 = (String str) -> str.length();
		System.out.println(stringLength1.getLength("TypeInferenceExample"));
		//--Don't need to specify the type.
		StringLengthLambda stringLength2 = (str) -> str.length();
		System.out.println(stringLength2.getLength("TypeInferenceExample"));
		//--Don't need to enclose within parentheses when you have single object. 
		StringLengthLambda stringLength3 = str -> str.length();
		System.out.println(stringLength3.getLength("TypeInferenceExample"));
		
		printLambdaResult(str->str.length());

		// --AddLambda Test
		AddLambda addLambda1 = (int a, int b) -> System.out.println("Addition : " + (a + b));
		addLambda1.add(10, 20);

		AddLambda addLambda2 = (a, b) -> System.out.println("Addition : " + (a + b));
		addLambda2.add(10, 20);

		// --CalculateLambda Test
		CalculateLambda calculateLambda1 = (int a, int b, String operation) -> System.out
				.println(operation + " : " + (a * b));
		calculateLambda1.calculate(5, 6, "Multiplication");

		CalculateLambda calculateLambda2 = (a, b, operation) -> System.out.println(operation + " : " + (a * b));
		calculateLambda2.calculate(4, 3, "Multiplication");

		CalculateLambda calculateLambda3 = (int a, int b, String operation) -> System.out
				.println(operation + " : " + (a / b));
		calculateLambda3.calculate(50, 10, "Division");

		CalculateLambda calculateLambda4 = (a, b, operation) -> {
			switch (operation) {
			case "Addition":
				System.out.println(operation + " : " + (a + b));
				break;
			case "Subtraction":
				System.out.println(operation + " : " + (a - b));
				break;
			case "Division": {
				if (b == 0) {
					System.out.println("Couldn't divide by zero!");
				} else {
					System.out.println(operation + " : " + (a / b));
				}
			}
				break;
			case "Multiplication":
				System.out.println(operation + " : " + (a * b));
				break;
			default:
				System.out.println("Oops!..Something went wrong while calculating!");
			}
		};
		calculateLambda4.calculate(80, 40, "Addition");
		calculateLambda4.calculate(80, 40, "Subtraction");
		calculateLambda4.calculate(20, 5, "Division");
		calculateLambda4.calculate(80, 0, "Division");
		calculateLambda4.calculate(30, 2, "Multiplication");
	}

	interface StringLengthLambda {
		public int getLength(String str);
	}

	interface AddLambda {
		public void add(int a, int b);
	}

	interface CalculateLambda {
		public void calculate(int a, int b, String operation);
	}
}
