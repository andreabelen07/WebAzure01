package com.proyecto_en_clase.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto_en_clase.demo.models.entity.Bodega;
import com.proyecto_en_clase.demo.models.services.IBodegaService;



@RestController
@RequestMapping("/api")
public class BodegaRestController {
	@Autowired
	private IBodegaService  bService;
	//Listar todos las bodegas
	@GetMapping("/listarbodega")
	public List<Bodega> index() {
		return bService.findAll();
	}
	//buscar las bodegas por id
	@GetMapping ("/listarbodega/{id}")
	public Bodega show(@PathVariable Long id) {
		return bService.findById(id);
	}
	//guardar las bodegas
	@PostMapping("/listarbodega")
	@ResponseStatus (HttpStatus.CREATED)
	public Bodega create(@RequestBody Bodega bodega) {
		return bService.save(bodega);
	}
	//editar las bodegas
	@PutMapping("/listarbodega/{id}")
	public Bodega update(@RequestBody Bodega bodega, @PathVariable Long id) {
		Bodega bdActual = bService.findById(id);
		bdActual.setId_bodega(bodega.getId_bodega());
		bdActual.setNombre(bodega.getNombre());
		bdActual.setUbicacion(bodega.getUbicacion());
		bdActual.setEstado(bodega.getEstado());
		return bService.save(bdActual);
	}
	//eliminar las bodegas
	@DeleteMapping("/listarbodega/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		bService.delete(id);
	}

}
