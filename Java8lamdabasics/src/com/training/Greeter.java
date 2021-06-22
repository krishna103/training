package com.training;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {

		Greeter greeter=new Greeter();
		HelloWorldGreeting helloWorldGreeting=new HelloWorldGreeting();
		//greeter.greet(h);
		
		Greeting lambaGreeting=()->System.out.println("hello world!");
		Greeting innerClassGreeting=new Greeting() {
			public void perform() {
				System.out.println("hello world!");
			}
		};
		
		greeter.greet(helloWorldGreeting);
		greeter.greet(innerClassGreeting);
		greeter.greet(lambaGreeting);
		greeter.greet(()->System.out.println("hello world!"));
		
	}

}
