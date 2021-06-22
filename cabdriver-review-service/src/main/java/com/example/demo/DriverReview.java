package com.example.demo;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Component
public class DriverReview {

	int reviewId;
	int driverId;
	double punctuality;
	double cleanliness;
	String reviewedBy;
}
