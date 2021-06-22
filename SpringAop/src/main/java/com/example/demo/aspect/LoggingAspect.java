package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class LoggingAspect {

	@Before(/*"allGetters()&&*/"forAllMethodsOfCircle()")
	public void loggingAdvice(JoinPoint joinpoint) {
		//System.out.println(joinpoint.toString());
	}
	
	@Before("args(name)")
	public void stringArgumentMethods(String name) {
		System.out.println("A method that takes String Argument has been Called "+name);
	}
	
//	@Before("allGetters()")
//	public void secondAdvice() {
//		System.out.println("Second Advice run");
//	}
//	
//	@Pointcut("execution(public * com.example.demo..get*(..))")
//	public void allGetters() {}
	
	// within is used for all methods of the particular class or Package
	
	@Pointcut("within(com.example.demo.model.Circle)")
	public void forAllMethodsOfCircle() {}
	
}
