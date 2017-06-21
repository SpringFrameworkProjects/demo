package com.example.looseCoupling;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class OutputController {
	//Using annotations to achieve loose coupling
		@Bean
		public IOutputGenerator helloWorld(){
			IOutputGenerator ioutPutGenertor=new CsvOutputGenerator();
			//IOutputGenerator ioutPutGenertor=new JsonOutputGenerator();
			return ioutPutGenertor;
		}
	//Using annotations to achieve loose coupling
}
