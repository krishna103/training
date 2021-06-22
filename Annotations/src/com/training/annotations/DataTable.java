package com.training.annotations;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
//@Target({ElementType.TYPE,ElementType.METHOD})
@Target(ElementType.TYPE)

public @interface DataTable {

	
     String tableName();
}
