package com.bolsadeideas.springboot.web.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.web.app.model.usuario;

public interface usuarioDaoApi extends CrudRepository<usuario, Long> {
	

}
