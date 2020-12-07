package com.appteste.app1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class app1oaf
{
@RequestMapping ("/oaf")

	@GetMapping
	public String oaf() 
	{		
		return "A Orientação ao futuro é importante pois juntamente com a mentalidade de crescimento, define a capacidade de formar um profissional de qualidade";
	}

}
