package com.jitin.java8exercise.Lambda.runnableexample;

public class RunnableExample {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			//--Annonymous inner class.
			@Override
			public void run() {
				System.out.println("Hello from runnable!");
			}
		});
		thread.run();
		
		//--Using Lambda
		Thread lambdaThread=new Thread(()->System.out.println("Hello from lambda runnable"));
		lambdaThread.run();
	}
}
