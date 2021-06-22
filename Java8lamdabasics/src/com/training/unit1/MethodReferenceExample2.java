package com.training.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.training.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {

		List<Person> people=Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Carrel",60),
				new Person("Thomas","Cateln",60),
				new Person("Charlet","Bronte",60),
				new Person("Mathew","Arnolds",60)
				);
		
		printCondition(people,p->true,System.out::println);
	}
	
	

	private static void printCondition(List<Person> people,Predicate<Person> predicate,Consumer<Person> consumer) {
		for(Person p:people) {
			if(predicate.test(p)) {
			consumer.accept(p);}}
	}
}
