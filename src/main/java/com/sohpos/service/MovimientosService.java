package com.sohpos.service;

import java.math.BigInteger;
import java.util.List;

import com.sohpos.entity.MovimientosEntity;

public interface MovimientosService {

	public List<MovimientosEntity> getMovimientos();

	public MovimientosEntity crearMovimiento(MovimientosEntity mov);

	public String eliminarMovimiento(MovimientosEntity mov);

	public MovimientosEntity modificarMov(MovimientosEntity mov);
}
