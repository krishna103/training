package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;

import com.example.demo.services.ReviewService;
import com.example.demo.utils.MyCondition;

@SpringBootApplication
public class CabdriverReviewServiceApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=
				SpringApplication.run(CabdriverReviewServiceApplication.class, args);
		
		ReviewService service=context.getBean(ReviewService.class);
		DriverReview review=service.getReview();
		System.out.println(review);
		List<DriverReview> list=service.getReviewList();
		list.forEach(System.out::println);
		context.close();
	}

	@Bean
	@Profile(value = "test")
	public DriverReview review1() {
		return new DriverReview(1010,443,4.5,3.5,"ravi");
	}
	@Bean
	@Conditional(MyCondition.class)
	public DriverReview review2() {
		return new DriverReview(2010,443,4.5,3.5,"amit");
	}
	@Bean
	@ConditionalOnProperty(name = "server.port", havingValue = "2020")
	public DriverReview review3() {
		return new DriverReview(2011,443,4.5,3.5,"shyam");
	}
	
}
