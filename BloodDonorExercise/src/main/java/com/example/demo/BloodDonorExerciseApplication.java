package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.BloodDonor;
import com.example.demo.ifaces.DonorRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class BloodDonorExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloodDonorExerciseApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			
			@Autowired
			private DonorRepository repo;
			
			@Override
			public void run(String... args) throws Exception {
				
				repo.save(new BloodDonor(1,"Krish","o+ve","G-block",123,LocalDate.of(2020,11,28)));
				repo.save(new BloodDonor(2,"Krishna","b+ve","G-block",123,LocalDate.of(2020,11,28)));
				repo.save(new BloodDonor(3,"ram","a+ve","G-block",123,LocalDate.of(2020,11,28)));
				repo.save(new BloodDonor(4,"raj","a+ve","G-block",123,LocalDate.of(2020,11,28)));
				repo.save(new BloodDonor(5,"rishi","o+ve","G-block",123,LocalDate.of(2020,11,28)));

			}
		};
	}
}
