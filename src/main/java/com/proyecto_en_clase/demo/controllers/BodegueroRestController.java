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

import com.proyecto_en_clase.demo.models.entity.Bodeguero;
import com.proyecto_en_clase.demo.models.services.IBodegueroService;


@RestController
@RequestMapping("/api")
public class BodegueroRestController {
	@Autowired
	private IBodegueroService  bodegueroService;
	//Listar todos los bedeguero
	@GetMapping("/listarbodeguero")
	public List<Bodeguero> index() {
		return bodegueroService.findAll();
	}
	//buscar los bedeguero por id
	@GetMapping ("/listarbodeguero/{id}")
	public Bodeguero show(@PathVariable Long id) {
		return bodegueroService.findById(id);
	}
	//guardar los bedeguero
	@PostMapping("//listarbodeguero")
	@ResponseStatus (HttpStatus.CREATED)
	public Bodeguero create(@RequestBody Bodeguero bodeguero) {
		return bodegueroService.save(bodeguero);
	}
	//editar los bedeguero
	@PutMapping("//listarbodeguero/{id}")
	public Bodeguero update(@RequestBody Bodeguero bodeguero, @PathVariable Long id) {
		Bodeguero bActual = bodegueroService.findById(id);
		bActual.setId_bodeguero(bodeguero.getId_bodeguero());
		bActual.setNombre(bodeguero.getNombre());
		bActual.setApellido(bodeguero.getApellido());
		bActual.setBodega(bodeguero.getBodega());
		bActual.setEstado(bodeguero.getEstado());
		
		return bodegueroService.save(bActual);
	}
	//eliminar los bedeguero
	@DeleteMapping("/listarbodeguero/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		bodegueroService.delete(id);
	}

}
