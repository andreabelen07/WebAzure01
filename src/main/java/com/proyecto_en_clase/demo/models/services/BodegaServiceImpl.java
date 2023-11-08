package com.proyecto_en_clase.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto_en_clase.demo.models.dao.IBodegaDao;
import com.proyecto_en_clase.demo.models.entity.Bodega;

@Service
public class BodegaServiceImpl implements IBodegaService {
	
	@Autowired
	private IBodegaDao bodegaDao;

	@Override
	@Transactional(readOnly= true)
	public List<Bodega> findAll() {
		// TODO Auto-generated method stub
		return (List<Bodega>) bodegaDao.findAll();
	}

	@Override
	@Transactional
	public Bodega save(Bodega bodega) {
		// TODO Auto-generated method stub
		return bodegaDao.save(bodega);
	}

	@Override
	@Transactional(readOnly= true)
	public Bodega findById(Long id) {
		// TODO Auto-generated method stub
		return bodegaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		bodegaDao.deleteById(id);
		
	}

	

}
