package com.bolsadeideas.springboot.formularios.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
	
	//	Metodos Handler
	@GetMapping("/form")
	public String form(Model model) {
		
		
		return "form";
	}
	
	
	@PostMapping("/form")
	public String procesar(Model model) {
		
		
		return "form";
	}
	

	
	
}