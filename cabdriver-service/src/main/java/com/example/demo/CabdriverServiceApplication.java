package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.daos.CabDriverDaoImpl;
import com.example.demo.entity.CabDriver;
import com.example.demo.ifaces.DataAccess;

@SpringBootApplication
public class CabdriverServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(CabdriverServiceApplication.class, args);
		
		CabDriver driver=context.getBean("cabDriver",CabDriver.class);
		driver.setId(22);
		driver.setDriverName("hemant");
		driver.setRating(4.6);
		System.out.println(driver);
		
//		DataAccess<CabDriver> dao=context.getBean(CabDriverDaoImpl.class);
//		int rowAdded=dao.add(driver);
//		System.out.println("Row added "+rowAdded);
		
//		List<CabDriver> list=dao.findAll();
//		list.forEach(System.out::println);
		
		CabDriver driverRamesh=context.getBean("driverRamesh",CabDriver.class);
		System.out.println(driverRamesh);
		CabDriver driverRamesh2=context.getBean("driverRamesh",CabDriver.class);
		System.out.println(driverRamesh2);
		System.out.println("Singleton = "+context.isSingleton("driverRamesh"));
		System.out.println("Prototype = "+context.isPrototype("driverRamesh"));
	
	    CabDriver driver3=context.getBean("sujju",CabDriver.class);
      	System.out.println(driver3);
		
		context.close();
	}
	
	@Bean("sujju")
	public CabDriver driverSuresh() {
		CabDriver sujju= new CabDriver();
		sujju.setId(34);
		sujju.setDriverName("suresh");
		sujju.setRating(4.0);
		return sujju;
	}

}
