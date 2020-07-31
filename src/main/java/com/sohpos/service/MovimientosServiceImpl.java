package com.sohpos.service;

import java.math.BigInteger;
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

	@Override
	public MovimientosEntity crearMovimiento(MovimientosEntity mov) {
		return movimientosRepo.save(mov);
	}

	/**
	 * @author JuanEstebanKatz
	 * @since 1.0
	 * Para eliminar un movimiento se debe validar que no sea activo.
	 */
	@Override
	public String eliminarMovimiento(MovimientosEntity mov) {
		String correcto = "activo";

		/**
		 * String result = mov.getEstado().toLowerCase().equals(correcto)? "No se puede
		 * eliminar esta Activa la cuenta" : "Borrado Exitosamente";
		 **/

		if (mov.getEstado().toLowerCase().equals(correcto)) {
			return "No se puede eliminar esta Activa la cuenta";
		} else
			movimientosRepo.deleteById(mov.getMovimientoId());
		return "Movimiento borrado Exitosamente";

	}

	@Override
	public MovimientosEntity modificarMov(MovimientosEntity mov) {
		return movimientosRepo.save(mov);
	}

}
