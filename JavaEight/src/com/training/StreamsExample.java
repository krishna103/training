package com.training;
import java.util.*;
import java.util.stream.*;

import com.training.model.Student;

public class StreamsExample {
	
	public static List<Student> getStudents(){
		Student ankit=new Student(101,"Ankit",78,35555);
		Student akit=new Student(102,"Akit",88,35558);
		Student kit=new Student(103,"Kit",98,45555);
		Student gourav=new Student(104,"Gourav",68,95555);
		Student vijay=new Student(105,"Vijay",58,35555);
        return Arrays.asList(vijay,gourav,kit,akit,ankit);
	}
	public static void main(String[] args) {
         System.out.println("Student who score more than 70");
         List<Student> moreThanSeventy=
        		 getStudents().stream().filter(eachStudent -> eachStudent.getMarkScored()>70).
        		 collect(Collectors.toList());
         moreThanSeventy.forEach(System.out::println);
		
         System.out.println("Student list with name and phone numbers");
         Map<String,Long> nameWithPhone=
        		 getStudents().stream().
        		 filter(eachStudent -> eachStudent.getMarkScored()>60).
        		 collect(Collectors.toMap(Student::getName,Student::getMobileNumber ));
         
		nameWithPhone.forEach((key,value) -> {
        	 System.out.println(key);
             System.out.println(value);        	 
         });
         
         System.out.println("Using terminal Operstor");
                 getStudents().stream().filter(eachStudent -> eachStudent.getMarkScored()>70).
                 forEach(System.out::println);
                 
         System.out.println("getting names in sorted manner");
         getStudents().stream().sorted(Comparator.comparing(Student::getName)).
         forEach(System.out::println);
	}

}
