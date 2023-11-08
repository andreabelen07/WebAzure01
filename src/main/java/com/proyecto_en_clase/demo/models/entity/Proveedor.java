package com.proyecto_en_clase.demo.models.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="proveedor")
public class Proveedor implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_proveedor;
	@Column(length = 60)
	private String ruc;
	@Column(length = 60)
	private String nombre_comercial;
	@Column(length = 60)
	private String representate_legal;
	@Column(length = 60)
	private Long credito;
	@Column(length = 60)
	private String direccion;
	@Column(length = 60)
	private Long telefono;
	@Column(length = 60)
	private Long estado;
	
	
	public Long getId_proveedor() {
		return id_proveedor;
	}
	public void setId_proveedor(Long id_proveedor) {
		this.id_proveedor = id_proveedor;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getNombre_comercial() {
		return nombre_comercial;
	}
	public void setNombre_comercial(String nombre_comercial) {
		this.nombre_comercial = nombre_comercial;
	}
	public String getRepresentate_legal() {
		return representate_legal;
	}
	public void setRepresentate_legal(String representate_legal) {
		this.representate_legal = representate_legal;
	}
	public Long getCredito() {
		return credito;
	}
	public void setCredito(Long credito) {
		this.credito = credito;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Long getTelefono() {
		return telefono;
	}
	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}
	public Long getEstado() {
		return estado;
	}
	public void setEstado(Long estado) {
		this.estado = estado;
	}	
	

}
