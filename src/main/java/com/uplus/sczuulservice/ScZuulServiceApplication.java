package com.uplus.sczuulservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ScZuulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScZuulServiceApplication.class, args);
	}

}
