package com.bolsadeideas.springboot.formularios.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bolsadeideas.springboot.formularios.app.models.domain.Usuario;

@Controller
public class FormController {
	
	//	Metodos Handler
	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("titulo", "Formulario Usuarios");
		
		return "form";
	}
	
	
	@PostMapping("/form")
	//	Capturando los parametros (username, password, email)
	public String procesar(Model model, @RequestParam String username, 
			@RequestParam String password, @RequestParam String email) {
		
		//	Instanciando al Modelo "Usuario"
		Usuario usuario = new Usuario();
		usuario.setUsername(username);
		usuario.setPassword(password);
		usuario.setEmail(email);
		
		model.addAttribute("usuario", usuario);
		
		model.addAttribute("titulo", "Resultado del Formulario");
		
		/*	Mostrandolo en el HTML "resultado"
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		model.addAttribute("email", email);*/
		
		return "resultado";
	}
	

	
	
}