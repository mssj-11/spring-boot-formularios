package com.bolsadeideas.springboot.formularios.app.models.domain;

import jakarta.validation.constraints.NotEmpty;

//	Clase Model del Formulario "Usuario"
public class Usuario {
	
	//	Validando
	@NotEmpty	//	Este campo es requerido
	//	Mismos parametros del formulario
	private String username;
	@NotEmpty
	private String password;
	@NotEmpty
	private String email;
	
	
	
	//	Getter and Setter
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}