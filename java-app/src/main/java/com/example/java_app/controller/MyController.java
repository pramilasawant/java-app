package com.example.java_app.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;;
 @RestController
public class MyController {
	 
	 @GetMapping("/java")
	 
   public String java()
   {
		 return "My First java application" ;
   }
   
}
