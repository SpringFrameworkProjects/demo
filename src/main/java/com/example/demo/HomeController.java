package com.example.demo;

import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController		//Registers this class as controller and no need to initialise this using beans
					//
@RequestMapping("/context1")
public class HomeController {
	//http://localhost:8080/context1/welcome/vamshi/chinta
	@RequestMapping("/welcome/{userName}/{surName}")
	public String home(@PathVariable("userName") String name,@PathVariable("surName") String surName){
		return "This worked! "+surName+" "+name;
	}
	//http://localhost:8080/context1/map/vamshi
	@RequestMapping("/map/{name}")
	public String map(@PathVariable Map<String,String> pathVars){
		return "This worked! "+pathVars.get("name");
	}
//	//http://localhost:8080/context1/personDetails/{vamshi}/{chinta}
//	@RequestMapping("/personDetails")
//	public String personDetails(@ModelAttribute("personDetails") personDetails personDetails){
//		return "test";
//	}
}
