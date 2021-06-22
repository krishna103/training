package com.training;

import java.lang.reflect.AnnotatedArrayType;

import com.training.model.Manager;
import com.training.model.Student;
import com.training.utils.AnnotationProcesssor;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationProcesssor.handleDataTable(new Student());
		
		
		AnnotationProcesssor.handleDataTable(new Manager());
		
		
		
	}

}
