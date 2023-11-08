package com.proyecto_en_clase.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.proyecto_en_clase.demo.models.entity.Bodeguero;

public interface IBodegueroDao extends CrudRepository<Bodeguero, Long> {

}
