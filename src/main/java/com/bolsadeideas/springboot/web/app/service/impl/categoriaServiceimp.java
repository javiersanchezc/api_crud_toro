package com.bolsadeideas.springboot.web.app.service.impl;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.web.app.commons.GenericServiceImpl;
import com.bolsadeideas.springboot.web.app.model.categoria;
import com.bolsadeideas.springboot.web.app.model.usuario;
import com.bolsadeideas.springboot.web.app.service.CategoriaServiceApi;

public class categoriaServiceimp extends GenericServiceImpl<categoria,Long> implements CategoriaServiceApi{

	@Override
	public categoria save(categoria entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public categoria get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CrudRepository<categoria, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
