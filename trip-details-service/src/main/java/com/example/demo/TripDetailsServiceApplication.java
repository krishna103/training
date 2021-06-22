package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.TripData;
import com.example.demo.ifaces.TripDataRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class TripDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripDetailsServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			
			@Autowired
			private TripDataRepository repo;
			
			@Override
			public void run(String... args) throws Exception {
				repo.save(new TripData(101,LocalDate.of(2020,10,14),"ram",400));
				repo.save(new TripData(102,LocalDate.of(2020,10,14),"Shyam",400));
				repo.save(new TripData(103,LocalDate.of(2020,10,12),"yash",200));
				repo.save(new TripData(104,LocalDate.of(2020,10,14),"yash",400));
				repo.save(new TripData(105,LocalDate.of(2020,10,14),"ram",800));

				
			}
		};
	}
}
