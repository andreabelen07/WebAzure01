package com.proyecto_en_clase.demo.models.entity;

import java.io.Serializable;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="bodeguero")
public class Bodeguero implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_bodeguero;
	@Column(length = 60)
	private String nombre;
	@Column(length = 60)
	private String apellido;
	@Column(length = 60)
	private Boolean estado;
	
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="id_bodeguero")
	private List<Bodega> bodega;

	public Long getId_bodeguero() {
		return id_bodeguero;
	}

	public void setId_bodeguero(Long id_bodeguero) {
		this.id_bodeguero = id_bodeguero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public List<Bodega> getBodega() {
		return bodega;
	}

	public void setBodega(List<Bodega> bodega) {
		this.bodega = bodega;
	}
	

}
