package com.proyecto_en_clase.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.proyecto_en_clase.demo.models.entity.Proveedor;

public interface IProveedorDao extends CrudRepository<Proveedor, Long>{

}
