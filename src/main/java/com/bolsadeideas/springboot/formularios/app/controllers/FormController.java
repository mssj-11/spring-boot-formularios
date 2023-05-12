package com.bolsadeideas.springboot.formularios.app.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;/*
import org.springframework.web.bind.annotation.RequestParam;*/

import com.bolsadeideas.springboot.formularios.app.models.domain.Usuario;

import jakarta.validation.Valid;


@Controller
public class FormController {
	
	//	Metodos Handler
	@GetMapping("/form")
	public String form(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("titulo", "Formulario Usuarios");
		model.addAttribute("usuario", usuario);
		
		return "form";
	}
	
	
	@PostMapping("/form")
	//	Capturando los parametros (username, password, email), Mapeando los parametros de la clase Usuario
	public String procesar(@Valid Usuario usuario, BindingResult result, Model model) {
		
		model.addAttribute("titulo", "Formulario de Registro");
		
		//	Si hubo un error en el formulario - mostrar mensajes
		if(result.hasErrors()) {
			Map<String, String> errores = new HashMap<>();
			result.getFieldErrors().forEach(err ->{
				errores.put(err.getField(), "El campo ".concat(err.getField()).concat(" ").concat(err.getDefaultMessage()));
			});
			model.addAttribute("error", errores);
			
			return "form";
		}
		
		/*	Instanciando al Modelo "Usuario"
		Usuario usuario = new Usuario();
		usuario.setUsername(username);
		usuario.setPassword(password);
		usuario.setEmail(email);*/
		
		model.addAttribute("usuario", usuario);
		
		//model.addAttribute("titulo", "Resultado del Formulario");
		
		/*	Mostrandolo en el HTML "resultado"
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		model.addAttribute("email", email);*/
		
		return "resultado";
	}
	

	
	
}