package com.bolsadeideas.springboot.web.app.commons;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public abstract   class GenericServiceImpl <T , ID extends Serializable> implements GenericServiceApi<T, ID> {

	@Override
	public T save(T entity) {
		// TODO Auto-generated method stub
		return getDao().save(entity);
	}

	@Override
	public void delete(ID id) {
		// TODO Auto-generated method stub
		getDao().deleteById(id);
		
	}

	@Override
	public T get(ID id) {
		// TODO Auto-generated method stub
		Optional<T> obj=getDao().findById(id);
		if(obj.isPresent())
		{
			return obj.get();
			
		}
		return null;
		
		
	
	}

	@Override
	public List<T> getAll() {
		// TODO Auto-generated method stub
	List<T> returnlist =new ArrayList<>();
	getDao().findAll().forEach(obj->returnlist.add(obj));
	return returnlist;
	
	}


	public abstract CrudRepository<T, ID> getDao();
	
	
}
