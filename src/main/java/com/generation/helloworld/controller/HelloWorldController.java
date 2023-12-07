package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/digite")
public class HelloWorldController {

	@GetMapping("/helloword")
	public String HelloWorld() {
		return "hello world";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Persistência;\r\n"
				+ "Mentalidade de Crescimento;\r\n"
				+ "Responsabilidade Pessoal;\r\n"
				+ "Orientação ao Futuro;\r\n"
				+ "Proatividade;\r\n"
				+ "Comunicação;\r\n"
				+ "Trabalho em Equipe;\r\n"
				+ "Orientação ao Detalhe;";
		
	}
	
	@GetMapping("/aprendizado")
	public String aprendizado() {
		return "Meus aprendizados da semana sera uma boa comunicação continuar aprendendo java e spring boot e estudar.";
		
	}
}
