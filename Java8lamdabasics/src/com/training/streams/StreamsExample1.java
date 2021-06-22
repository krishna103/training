package com.training.streams;

import java.util.Arrays;
import java.util.List;

import com.training.Person;

public class StreamsExample1 {

	public static void main(String[] args) {

		List<Person> people=Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Carrel",60),
				new Person("Thomas","Cateln",60),
				new Person("Charlet","Bronte",60),
				new Person("Mathew","Arnolds",60)
				);
		people.stream()
		.filter(p->p.getLastName().startsWith("C"))
		.forEach(p->System.out.println(p.getFirstName()));
		
	long sum=people.stream()
		.filter(p->p.getLastName().startsWith("D"))
		.count();
	System.out.println(sum);
	
	long sum2=people.parallelStream()
			.filter(p->p.getLastName().startsWith("C"))
			.count();
		System.out.println(sum2);
	}

}
