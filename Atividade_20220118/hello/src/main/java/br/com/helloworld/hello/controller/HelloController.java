package br.com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")

public class HelloController {

	@GetMapping
	public String Hello() {
		return "Hello gen it's my!!!,"
				+ "Perssistencia, Quero logo me aprende o maximo de coisa para me torna um Full-Stack,"
				+ "essa semana eu espero conseguir terminar a parte de banco de dados pois achei bem legal";
		
	}
}
