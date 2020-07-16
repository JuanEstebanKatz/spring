package com.sohpos.service;

import java.util.List;

import com.sohpos.entity.CuentaEntity;

/**
 * 
 * @author JuanEsteban
 * Clase con l�gica para Cuentas de la aplicaci�n
 * @since 1.0
 */
public interface CuentaService {

	public List<CuentaEntity> obtenerCuentas();
}
