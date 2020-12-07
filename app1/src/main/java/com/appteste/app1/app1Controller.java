package com.appteste.app1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/persistencia")
public class app1Controller 
{

	@GetMapping 
	public String persistencia() 
	{
		return "A persistência foi necessária para aprender a matéria, pois mediante erros e falhas a força de vontade deve prevalecer";
	}

}

