package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {

		// IoC container is instantiated
		BeanFactory context= new ClassPathXmlApplicationContext("bean.xml");
//		CabDriver driverRamesh=context.getBean(CabDriver.class);
//		System.out.println(driverRamesh);
		
		CabDriver driverRamesh=context.getBean("ramesh",CabDriver.class);
     	System.out.println(driverRamesh);
     	
     	CabDriver driverRajesh=context.getBean("rajesh",CabDriver.class);
     	System.out.println(driverRajesh);
	}

}
