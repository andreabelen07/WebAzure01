package com.proyecto_en_clase.demo.models.services;

import java.util.List;

import com.proyecto_en_clase.demo.models.entity.Bodega;

public interface IBodegaService {
	public List<Bodega>findAll();
	public Bodega save (Bodega bodega);
	public Bodega findById(Long id);
	public void delete(Long id);

}
