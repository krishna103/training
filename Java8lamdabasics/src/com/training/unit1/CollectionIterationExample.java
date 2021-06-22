package com.training.unit1;

import java.util.Arrays;
import java.util.List;

import com.training.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {

		List<Person> people=Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Carrel",60),
				new Person("Thomas","Cateln",60),
				new Person("Charlet","Bronte",60),
				new Person("Mathew","Arnolds",60)
				);
		System.out.println("using for loop");
		for(int i=0;i<people.size();++i)
		{
			System.out.println(people.get(i));
		}
		System.out.println("using for in loop");
		for(Person p:people)
			System.out.println(p);
		
		System.out.println("using for each loop");
		people.forEach(System.out::println);
		
	}

}
