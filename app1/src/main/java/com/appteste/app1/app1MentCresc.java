package com.appteste.app1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class app1MentCresc
{
@RequestMapping ("/mentcrescimento")

	@GetMapping
	public String mentcrescimento() 
	{		
		return "A mentalidade de crescimento é importante nesse cenário pois é a partir dela que podemos aprender e evoluir,"
				+ "sempre buscando melhorias e não se deixando abalar pelas dificuldades";
	}
	
}
