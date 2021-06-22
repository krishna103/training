package com.training;

public class TypeInferenceExample {

	public static void main(String[] args) {

		printLambda(s->s.length());
		
	}
	public static void printLambda(Stringll a)
	{
		System.out.println(a.getlen("Helloo Lambda"));
	}
	interface Stringll{
		int getlen(String s);
	}

}
