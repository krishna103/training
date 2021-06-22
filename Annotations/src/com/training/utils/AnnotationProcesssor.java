package com.training.utils;

import java.lang.annotation.Annotation;

import com.training.annotations.DataTable;
import com.training.model.Student;

public class AnnotationProcesssor {

	
	public static void handleDataTable(Object obj) {
		
		 Class instance =obj.getClass();
		 
		                  
	   DataTable annotation = (DataTable)instance.getAnnotation(DataTable.class);
		   String tableName =annotation.tableName();
		   
		   String sql = "insert into  "+tableName+" values(?,?,?)";
		   System.out.println(tableName);
		   System.out.println(sql);
		  
		  	}
}
