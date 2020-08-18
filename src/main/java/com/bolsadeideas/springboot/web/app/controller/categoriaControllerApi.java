package com.bolsadeideas.springboot.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.web.app.model.categoria;
import com.bolsadeideas.springboot.web.app.model.usuario;
import com.bolsadeideas.springboot.web.app.service.CategoriaServiceApi;
import com.bolsadeideas.springboot.web.app.service.UsuarioServiceApi;

@RestController
@RequestMapping(value = "/api/v2/")
public class categoriaControllerApi {
	
	/*
	@Autowired
	private CategoriaServiceApi categoServiceApi;
	
	@GetMapping(value ="/all")
	public List<categoria> getAll(){		
		
		return categoServiceApi.getAll();
		
		
	}
	*/

}
