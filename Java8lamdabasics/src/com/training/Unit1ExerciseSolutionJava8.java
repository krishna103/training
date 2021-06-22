package com.training;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {

		List<Person> people=Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Carrel",60),
				new Person("Thomas","Cateln",60),
				new Person("Charlet","Bronte",60),
				new Person("Mathew","Arnolds",60)
				);
		// step1: sort list by last name
		
		Collections.sort(people,(o1,o2)->o1.getLastName().compareTo(o2.getLastName()));
		
		// step2: Create a method that prints all elements in the list
		printCondition(people,p->true,p->System.out.println(p));
		System.out.println();
		// step3: create a method that prints all the last nAMES ends with c
		  printCondition(people, p->p.getLastName().startsWith("C"),p->System.out.println(p));
		  System.out.println();
		  
		  printCondition(people, p->p.getFirstName().startsWith("C"),p->System.out.println(p.getFirstName())); 
	}
	
	

	private static void printCondition(List<Person> people,Predicate<Person> predicate,Consumer<Person> consumer) {
		for(Person p:people) {
			if(predicate.test(p)) {
			consumer.accept(p);}}
	}

}
