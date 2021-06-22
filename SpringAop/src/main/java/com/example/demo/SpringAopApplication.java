package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Circle;
import com.example.demo.model.Triangle;
import com.example.demo.service.ShapeService;

@SpringBootApplication
public class SpringAopApplication {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext ctx =SpringApplication.run(SpringAopApplication.class, args);
	ShapeService ss=ctx.getBean(ShapeService.class);
	ss.getCircle().setName("dummy name");
	System.out.println(ss.getCircle().getName());
	ctx.close();
	}

//	@Bean
//	public Triangle triangle() {
//		Triangle t1=new Triangle();
//		t1.setName("Triangle Name");
//		return t1;
//	}
//	
//	@Bean
//	public Circle circle() {
//		Circle c1=new Circle();
//		c1.setName("Circle Name");
//		return c1;
//	}
}
