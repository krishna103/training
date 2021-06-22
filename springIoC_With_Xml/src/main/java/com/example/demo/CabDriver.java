package com.example.demo;

import lombok.AccessLevel;

import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class CabDriver {

	 int id;
	 String driverName;
	 double rating;
	 
}
