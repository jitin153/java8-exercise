package com.jitin.java8exercise.Lambda;

public class Greeter {

	// greetingLambda=()->System.out.print("Hello");
	// doDouble=(int a)->a*2;
	// doAdd=(int a,int b)-> a+b;
	/*
	 * safeDivide=(int a,int b)->{ if(b==0) return 0; else return a/b; };
	 */
	// stringLengthCount=(String str)->str.Length();

	public static void greet(Greeting greeting) {
		greeting.perform();
	}
	public static void greetLambda(GreetInterface greetLambda) {
		greetLambda.foo();
	}

	public static void main(String[] args) {
		Greeting greeting = new HelloGreeting();
		greet(greeting);
		greeting.perform();
		// --Lambda Testing--
		GreetInterface greetLambda = () -> System.out.println("Hello Lambda");
		greetLambda(() -> System.out.println("Hello Lambda"));
		greetLambda(greetLambda);
		
		Greeting greetingLambda=() -> System.out.println("Hello Lambda from greeting interface");
		greet(greetingLambda);
		greetingLambda.perform();
		greet(() -> System.out.println("Hello Lambda from greeting interface"));
		
		//--Annonymous Class--
		Greeting greetingFromAnnonymous=new Greeting() {
			public void perform() {
				System.out.println("Hello from annonymous");
			}
		};
		/**
		We can think labmda as shortcut for annonymous classes but its a different thing.
		*/
		greetingFromAnnonymous.perform();
		greet(greetingFromAnnonymous);
	}
}
interface GreetInterface {
	void foo();
}
