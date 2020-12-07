package com.appteste.app1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class app1aad
{
@RequestMapping ("/aad")

	@GetMapping
	public String aad() 
	{		
		return "Atenção aos detalhes é relevante nesse processo, assim como na maioria dos outros, pois até o menor dos detalhes pode ser a diferença entre uma aplicação funcionando e algo falho";
	}

}
