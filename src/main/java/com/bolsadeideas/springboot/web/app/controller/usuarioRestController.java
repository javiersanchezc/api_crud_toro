package com.bolsadeideas.springboot.web.app.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.web.app.model.categoria;
import com.bolsadeideas.springboot.web.app.model.usuario;
import com.bolsadeideas.springboot.web.app.service.CategoriaServiceApi;
import com.bolsadeideas.springboot.web.app.service.UsuarioServiceApi;

@RestController
@RequestMapping(value = "/api/v1/")
public class usuarioRestController {
	@Autowired
	private UsuarioServiceApi usoroServiceApi;
	
	@Autowired
	private CategoriaServiceApi categoServiceApi;
	
	@GetMapping(value ="/all")
	public List<usuario> getAll(){		
		
		return usoroServiceApi.getAll();
		
		
	}
	
	@GetMapping(value = "/find/{id}")
	public usuario find(@PathVariable Long id) {
		return usoroServiceApi.get(id);
	}
	
	
	
	
	@PostMapping(value="/save")
	public ResponseEntity<usuario> save(@RequestBody usuario usoro){
		
		usuario obj =usoroServiceApi.save(usoro);
		
		return new ResponseEntity<usuario>(obj,HttpStatus.OK);		
		
		
	}
	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<usuario> delete(@PathVariable Long id) {
		usuario usoro = usoroServiceApi.get(id);
		if (usoro != null) {
			usoroServiceApi.delete(id);
		}else {
			return new ResponseEntity<usuario>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<usuario>(usoro, HttpStatus.OK);
	}
	
	
	
	
	@GetMapping(value ="categoria/all")
	public List<categoria> getAllcategoria(){		
		
		return categoServiceApi.getAll();
		
		
	}

}
