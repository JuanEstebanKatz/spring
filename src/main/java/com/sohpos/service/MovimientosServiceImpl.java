package com.sohpos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sohpos.entity.MovimientosEntity;
import com.sohpos.repository.MovimientosRepository;

@Service
public class MovimientosServiceImpl implements MovimientosService {

	@Autowired
	MovimientosRepository movimientosRepo;
	
	@Override
	public List<MovimientosEntity> getMovimientos() {
		return (List<MovimientosEntity>) movimientosRepo.findAll();
	}

}
