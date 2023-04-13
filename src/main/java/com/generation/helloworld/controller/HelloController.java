package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "<b>Hello Turma 62!</b>";
	}
	
	@GetMapping("/nome")
	public String meuNome() {
		return "<b>Hello, Joyce</b>";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "<br>Mentalidade de Crescimento\" + \"<br>Persistência\" + \"<br>Responsabilidade Pessoal\"\r\n"
				+ "				+ \"<br>Orientação ao Futuro\" + \"<br>Comunicação\" + \"<br>Orientação ao Detalhe\" + \"<br>Proatividade\"\r\n"
				+ "				+ \"<br>Trabalho em Equipe\" + \"<br>Dar e Receber\" + \"<br>Gestão do Tempo<br>";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "<b>Como objetivo essa semana tenho a proatividade e gestão de tempo<br /><br />"
				+ "<b>A minha proatividade essa não está muito bem trabalhada, por falta de confiança"
				 + "<b>E a minha gestão de tempo está ruim tambem, porque acabei postergando algumas atividades por pura preguiça\"\\r\\n"
				  + "<b>Por isso necessito intensificar minhas ações com essa habilidade e mentalidade<br>";
	}

}
