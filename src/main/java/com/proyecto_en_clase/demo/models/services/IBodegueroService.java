package com.proyecto_en_clase.demo.models.services;

import java.util.List;

import com.proyecto_en_clase.demo.models.entity.Bodeguero;

public interface IBodegueroService {
	public List<Bodeguero>findAll();
	public Bodeguero save (Bodeguero bodeguero);
	public Bodeguero findById(Long id);
	public void delete(Long id);

}
