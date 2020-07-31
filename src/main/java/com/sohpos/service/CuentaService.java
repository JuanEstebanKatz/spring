package com.sohpos.service;

import java.math.BigInteger;
import java.util.List;

import com.sohpos.entity.ClienteEntity;
import com.sohpos.entity.CuentaEntity;

/**
 * 
 * @author JuanEsteban
 * Clase con lógica para Cuentas de la aplicación
 * @since 1.0
 */
public interface CuentaService {

	public List<CuentaEntity> obtenerCuentas();

	public CuentaEntity crearCuenta(CuentaEntity cuenta);

	public String eliminarCuenta(BigInteger id);

	public CuentaEntity modificarCuenta(CuentaEntity cuenta);
}
