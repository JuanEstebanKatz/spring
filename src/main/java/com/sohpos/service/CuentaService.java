package com.sohpos.service;

import java.util.List;

import com.sohpos.entity.CuentaEntity;

/**
 * 
 * @author JuanEsteban
 * Clase con lógica para Cuentas de la aplicación
 * @since 1.0
 */
public interface CuentaService {

	public List<CuentaEntity> obtenerCuentas();
}
