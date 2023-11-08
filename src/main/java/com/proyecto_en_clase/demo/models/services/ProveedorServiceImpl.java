package com.proyecto_en_clase.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto_en_clase.demo.models.dao.IProveedorDao;
import com.proyecto_en_clase.demo.models.entity.Proveedor;


@Service
public class ProveedorServiceImpl implements IProveedorService {
	
	@Autowired
	private IProveedorDao proveedorDao;
		
	
	@Override
	@Transactional(readOnly= true)
	public List<Proveedor> findAll() {
		return (List<Proveedor>) proveedorDao.findAll();
	}

	@Override
	@Transactional
	public Proveedor save(Proveedor proveedor) {
		return proveedorDao.save(proveedor);
	}


	@Override
	@Transactional(readOnly= true)
	public Proveedor findById(Long id) {
		// TODO Auto-generated method stub
		return proveedorDao.findById(id).orElse(null);
	}


	@Override
	@Transactional
	public void delete(Long id) {
		proveedorDao.deleteById(id);
		
	}
	
}
