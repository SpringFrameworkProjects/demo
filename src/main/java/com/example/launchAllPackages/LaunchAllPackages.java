package com.example.launchAllPackages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages={"com.example.demo","com.example.looseCoupling","com.example.launchAllPackages"})
@SpringBootApplication
public class LaunchAllPackages {
	public static void main( String[] args )
	{
			SpringApplication.run(LaunchAllPackages.class, args);
		   
	}
}

