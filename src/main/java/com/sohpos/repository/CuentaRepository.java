package com.sohpos.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.sohpos.entity.CuentaEntity;

public interface CuentaRepository extends CrudRepository<CuentaEntity, BigInteger>{

}
