package com.sohpos.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sohpos.entity.MovimientosEntity;

public interface MovimientosRepository extends CrudRepository<MovimientosEntity, BigInteger> {

	List<MovimientosEntity> findByCuentaId (BigInteger id);
}
