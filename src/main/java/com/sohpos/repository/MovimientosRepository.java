package com.sohpos.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.sohpos.entity.MovimientosEntity;

public interface MovimientosRepository extends CrudRepository<MovimientosEntity, BigInteger>{

}
