package com.microservicio1.proyMicroservicio.dao;

import org.springframework.data.repository.CrudRepository;

import com.microservicio1.proyMicroservicio.entity.Producto;


public interface ProductoDao extends CrudRepository<Producto, Long> {

}
