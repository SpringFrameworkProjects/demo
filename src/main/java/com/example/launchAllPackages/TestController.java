package com.example.launchAllPackages;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
	@RequestMapping("/testController")
	public String testController(){
		return "LOL";
	}
}
