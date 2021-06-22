package com.training;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.training.ifaces.Converter;
import com.training.services.FunctionalJava;

public class Application {

	public static void main(String[] args) {

		FunctionalJava func=new FunctionalJava();
		Converter<Double, Double> conv1=val->val*75;
		double resp=func.useConverter(conv1,100.00);
		System.out.println(resp);
		double resp2=func.useConverter(far->(far-32)*5/9,45);
		System.out.println(resp2);
		List<String> list = Arrays.asList("Ramesh","shiv","sunder","Suresh","Magesh");
		list.forEach(e ->System.out.println(e));
		System.out.println("=======");
		Predicate<String> testForSH=arg->arg.contains("sh");
		for(String eachString:list)
		{
			if(testForSH.test(eachString)) {
				System.out.println(eachString);
			}
		}
	}

}
