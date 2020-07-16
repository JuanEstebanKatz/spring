package com.sohpos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sohpos.entity.CuentaEntity;
import com.sohpos.repository.CuentaRepository;

@Service
public class CuentaServiceImpl implements CuentaService{

	@Autowired
	public CuentaRepository cuentaRepo;
	@Override
	public List<CuentaEntity> obtenerCuentas() {
		return (List<CuentaEntity>)cuentaRepo.findAll();
	}

}
