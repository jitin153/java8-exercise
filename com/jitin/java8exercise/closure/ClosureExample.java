package com.jitin.java8exercise.closure;

public class ClosureExample {
	public static void main(String[] args) {
		int a = 10;
		//--Compiler is not complaining but the value of b must final. Because value of b is actually being used in process method which is out of scope. 
		int b = 20;
		//--Compiler assumes that the b is final.
		//final int b=20;
		doProcess(a, new Process() {
			//--if you to change the value of b here you will get an error.
			//b=40;
			@Override
			public void process(int i) {
				System.out.println(i + b);
			}
		});
		
		//---Same thing using lambda expression.
		doProcess(a,i->System.out.println(i+b));
	}

	private static void doProcess(int i, Process p) {
		p.process(i);
	}
}

interface Process {
	void process(int i);
}
