package com.microservicio1.proyMicroservicio.service;

import java.util.List;

import com.microservicio1.proyMicroservicio.entity.Producto;

public interface IProductoService {

	public List<Producto> findAll();
	
	public Producto findById(Long id);
}
