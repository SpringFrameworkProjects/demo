package com.example.looseCoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService {
	//Loose coupling using Annotations
	@Autowired
	private OutputController ;
	@RequestMapping("/testAnnotations")
	public String getMessageUsingAnnotations(){
		return (String) ((IOutputGenerator)outputController.helloWorld()).generateOutput();
	}
	
	
	//Loose coupling using Beans
	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"Spring-Common.xml"});
	OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
	@RequestMapping("/testBeans")
	public String getMessageUsingBeans(){
		return output.generateOutput();
	}
	
}
