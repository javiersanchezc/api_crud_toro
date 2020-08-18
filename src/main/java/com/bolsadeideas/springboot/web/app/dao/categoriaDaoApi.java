package com.bolsadeideas.springboot.web.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.web.app.model.categoria;

public interface categoriaDaoApi extends CrudRepository<categoria, Long> {
	

}
