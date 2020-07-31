package com.sohpos.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sohpos.entity.CuentaEntity;

public interface CuentaRepository extends CrudRepository<CuentaEntity, BigInteger>{

	List<CuentaEntity> findByClienteId(BigInteger idCliente);
}
