package com.bolsadeideas.springboot.web.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.web.app.commons.GenericServiceImpl;
import com.bolsadeideas.springboot.web.app.dao.usuarioDaoApi;
import com.bolsadeideas.springboot.web.app.model.usuario;
import com.bolsadeideas.springboot.web.app.service.UsuarioServiceApi;


@Service
public class usuarioServiceimp extends GenericServiceImpl<usuario, Long> implements UsuarioServiceApi{

	@Autowired
	private usuarioDaoApi usuroDaoApi;
	
	@Override
	public CrudRepository<usuario, Long> getDao() {
		// TODO Auto-generated method stub
		return usuroDaoApi;
	}

}
