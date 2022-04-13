package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	
	//ok we know our service function input and output, NO i dont rmemeber dont write controller
	
	@GetMapping("/hereispurpose")
	public ResponseEntity<Account> getAccountDetails(@RequestParam("x") int accno)
	{
		ResponseEntity<Account> responseEntity=null;
		System.out.println("input got is" + accno);
		Account account = new Account(1,2,3);//this is wrong .. relax, logic you can think
		//in service not in controller
		if(accno == 1)
			 responseEntity =new ResponseEntity(account, HttpStatus.OK);
		else
			responseEntity =new ResponseEntity( HttpStatus.NOT_FOUND);
		return responseEntity;
		
		
	}
	
	
	
/*
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")  //wecleom to observer design pattern we are listener.
	public Greeting whocares(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	*/
}
