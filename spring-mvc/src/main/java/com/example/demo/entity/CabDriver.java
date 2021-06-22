package com.example.demo.entity;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Component
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class CabDriver {

	int id;
	@Length(min=3,max = 20,message = "name should be 3 to 20 characters")
	String driverName;
	double rating;
	/*Address*/ String address;
}
