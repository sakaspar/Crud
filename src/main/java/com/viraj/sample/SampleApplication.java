package com.viraj.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
@ContextConfiguration(locations =  {"classpath*:/spring/test-context.xml"})
public class SampleApplication {

	@GetMapping("/welcome/{name}")
	public String wish(@PathVariable String name) {
		return "Hi "+name+" Welcome to Doctor Service";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	

}