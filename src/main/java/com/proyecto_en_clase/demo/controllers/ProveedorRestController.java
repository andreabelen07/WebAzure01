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

import com.proyecto_en_clase.demo.models.entity.Proveedor;
import com.proyecto_en_clase.demo.models.services.IProveedorService;

@RestController
@RequestMapping("/api")
public class ProveedorRestController {
	@Autowired
	private IProveedorService  proveedorService;
	//Listar todos los proveedores
	@GetMapping("/listarproveedor")
	public List<Proveedor> index() {
		return proveedorService.findAll();
	}
	//buscar un proveedor por id
	@GetMapping ("/listarproveedor/{id}")
	public Proveedor show(@PathVariable Long id) {
		return proveedorService.findById(id);
	}
	//guardar un proveedor
	@PostMapping("/listarproveedor")
	@ResponseStatus (HttpStatus.CREATED)
	public Proveedor create(@RequestBody Proveedor proveedor) {
		return proveedorService.save(proveedor);
	}
	//editar un proveedor
	@PutMapping("/listarproveedor/{id}")
	public Proveedor update(@RequestBody Proveedor proveedor, @PathVariable Long id) {
		Proveedor proveedorActual = proveedorService.findById(id);
		proveedorActual.setId_proveedor(proveedor.getId_proveedor());
		proveedorActual.setNombre_comercial(proveedor.getNombre_comercial());
		proveedorActual.setRuc(proveedor.getRuc());
		proveedorActual.setRepresentate_legal(proveedor.getRepresentate_legal());
		proveedorActual.setCredito(proveedor.getCredito());
		proveedorActual.setTelefono(proveedor.getTelefono());
		proveedorActual.setDireccion(proveedor.getDireccion());
		proveedorActual.setEstado(proveedor.getEstado());
		return proveedorService.save(proveedorActual);
	}
	//eliminar proveedor
	@DeleteMapping("/listarproveedor/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		proveedorService.delete(id);
	}

}
