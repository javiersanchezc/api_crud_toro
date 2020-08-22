package com.bolsadeideas.springboot.web.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.web.app.commons.GenericServiceImpl;
import com.bolsadeideas.springboot.web.app.dao.categoriaDaoApi;
import com.bolsadeideas.springboot.web.app.model.categoria;
import com.bolsadeideas.springboot.web.app.model.usuario;
import com.bolsadeideas.springboot.web.app.service.CategoriaServiceApi;

@Service
public class categoriaServiceimp extends GenericServiceImpl<categoria,Long> implements CategoriaServiceApi{

	@Autowired
	categoriaDaoApi categoriadao;
	

	@Override
	public CrudRepository<categoria, Long> getDao() {
		// TODO Auto-generated method stub
		return categoriadao;
	}

}
