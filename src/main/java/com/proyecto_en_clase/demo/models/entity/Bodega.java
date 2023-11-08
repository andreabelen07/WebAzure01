package com.proyecto_en_clase.demo.models.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="bodega", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_bodeguero"})})
public class Bodega implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_bodega;
	@Column(length = 60)
	private String nombre;
	@Column(length = 60)
	private String ubicacion;
	@Column(length = 60)
	private Boolean estado;
	
	public Long getId_bodega() {
		return id_bodega;
	}
	public void setId_bodega(Long id_bodega) {
		this.id_bodega = id_bodega;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

}
