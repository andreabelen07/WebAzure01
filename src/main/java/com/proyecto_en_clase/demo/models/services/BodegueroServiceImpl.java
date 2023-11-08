package com.proyecto_en_clase.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto_en_clase.demo.models.dao.IBodegueroDao;
import com.proyecto_en_clase.demo.models.entity.Bodeguero;

@Service
public class BodegueroServiceImpl implements IBodegueroService{

	@Autowired
	private IBodegueroDao bodegueroDao;
	
	@Override
	@Transactional(readOnly= true)
	public List<Bodeguero> findAll() {
		// TODO Auto-generated method stub
		return (List<Bodeguero>) bodegueroDao.findAll();
	}

	@Override
	@Transactional
	public Bodeguero save(Bodeguero bodeguero) {
		// TODO Auto-generated method stub
		return bodegueroDao.save(bodeguero);
	}

	@Override
	@Transactional(readOnly= true)
	public Bodeguero findById(Long id) {
		// TODO Auto-generated method stub
		return bodegueroDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		bodegueroDao.deleteById(id);
		
	}

}
