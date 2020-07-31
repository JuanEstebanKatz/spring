package com.sohpos.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sohpos.entity.ClienteEntity;
import com.sohpos.entity.CuentaEntity;
import com.sohpos.entity.MovimientosEntity;
import com.sohpos.repository.CuentaRepository;
import com.sohpos.repository.MovimientosRepository;

@Service
public class CuentaServiceImpl implements CuentaService{

	@Autowired
	public CuentaRepository cuentaRepo;
	
	@Autowired
	public MovimientosRepository movimientosRepo;
	
	@Override
	public List<CuentaEntity> obtenerCuentas() {
		return (List<CuentaEntity>)cuentaRepo.findAll();
	}
	
	@Override
	public CuentaEntity crearCuenta(CuentaEntity cuenta) {
		return cuentaRepo.save(cuenta);
	}
	@Override
	public String eliminarCuenta(BigInteger id) {
		String resultado = movimientosRepo.findByCuentaId(id).isEmpty()?
							"borrado exitosamente" 
							: "hay movimientos no es posible eliminar";
		return resultado;
	}
	@Override
	public CuentaEntity modificarCuenta(CuentaEntity cuenta) {
		return cuentaRepo.save(cuenta);
	}

}
