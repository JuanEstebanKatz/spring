package com.sohpos.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.sohpos.entity.ClienteEntity;

public interface ClienteRepository extends CrudRepository<ClienteEntity, BigInteger> {

}
