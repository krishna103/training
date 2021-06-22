package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.ifaces.IssueRepository;
import com.example.demo.model.Issue;

@SpringBootApplication
public class BugTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BugTrackerApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			
			@Autowired
			private IssueRepository repo;
			
			@Override
			public void run(String... args) throws Exception {

				repo.save(new Issue(1001,"bug1","Description for p1","p1","high","trivial","Krish"));
				repo.save(new Issue(1002,"bug2","Description for p2","p2","medium","non trivial","Ram"));
				repo.save(new Issue(1003,"bug3","Description for p3","p3","low","trivial","Jaggu"));
				repo.save(new Issue(1004,"bug4","Description for p4","p4","high","non trivial","Suraj"));
				repo.save(new Issue(1005,"bug5","Description for p5","p5","medium","trivial","Harshit"));
				repo.save(new Issue(1006,"bug6","Description for p6","p6","low","non trivial","Ajay"));
				repo.save(new Issue(1007,"bug7","Description for p7","p7","high","trivial","Sumit"));

			}
		};
	}

}
