package com.bolsadeideas.springboot.web.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="categorias")
public class categoria {
	
	public Long getIdcategorias() {
		return idcategorias;
	}
	public void setIdcategorias(Long idcategorias) {
		this.idcategorias = idcategorias;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUrlimagen() {
		return urlimagen;
	}
	public void setUrlimagen(String urlimagen) {
		this.urlimagen = urlimagen;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcategorias;
	@Column
	private String nombre;
	@Column
	private String urlimagen;
	@Column
	private Date fecha;
	

}
