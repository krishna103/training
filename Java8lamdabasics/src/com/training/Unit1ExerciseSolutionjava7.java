package com.training;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionjava7 {

	public static void main(String[] args) {

		List<Person> people=Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Carrel",60),
				new Person("Thomas","Cateln",60),
				new Person("Charlet","Bronte",60),
				new Person("Mathew","Arnolds",60)
				);
		// step1: sort list by last name
		
		Collections.sort(people,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		// step2: Create a method that prints all elements in the list
		printAll(people);
		System.out.println();
		// step3: create a method that prints all the last nAMES ends with c
		  printCondition(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
					
			}
		});
		  System.out.println();
		  
		  printCondition(people, new Condition() {
				
				@Override
				public boolean test(Person p) {
					return p.getFirstName().startsWith("C");
						
				}
			}); 
	}
	
	

	private static void printCondition(List<Person> people,Condition condition) {
		for(Person p:people) {
			if(condition.test(p)) {
			System.out.println(p);}}
	}

	private static void printAll(List<Person> people) {

		for(Person p:people)
			System.out.println(p);
	}

}
interface Condition{
	boolean test(Person p);
}
