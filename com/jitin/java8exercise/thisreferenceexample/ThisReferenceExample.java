package com.jitin.java8exercise.thisreferenceexample;

public class ThisReferenceExample {
	public void doProcess(int i, Process p) {
		p.process(i);
	}

	public void execute() {
		doProcess(10, i -> {
			System.out.println("Value is : " + i);
			// --This will work because now we are using this outside the static context.
			System.out.println(this);
		});
	}

	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		thisReferenceExample.doProcess(10, new Process() {
			@Override
			public void process(int i) {
				System.out.println("Value is : " + i);
				System.out.println(this);
			}
			@Override
			public String toString() {
				return "This is anonymous class!";
			}
		});

		// ---Using lambda
		thisReferenceExample.doProcess(10, i -> {
			System.out.println("Value is : " + i);
			// --This will not work because lambda is slight different than anonymous inner class.
			// System.out.println(this);
		});

		// --Separte method to make it work.
		thisReferenceExample.execute();
	}

	@Override
	public String toString() {
		return "This is ThisReferenceExample class!";
	}
}

interface Process {
	void process(int i);
}
