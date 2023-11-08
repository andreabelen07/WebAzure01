package com.proyecto_en_clase.demo.models.services;

import java.util.List;

import com.proyecto_en_clase.demo.models.entity.Proveedor;

public interface IProveedorService {
	public List<Proveedor>findAll();
	public Proveedor save (Proveedor proveedor);
	public Proveedor findById(Long id);
	public void delete(Long id);

}
