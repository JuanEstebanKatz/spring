package com.sohpos.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sohpos.entity.ClienteEntity;

/**
 * @author JuanEsteban
 * Clase que maneja lógica para clientes del aplicativo.
 */
public interface ClienteService {
	
	public List<ClienteEntity> getClientes();
	
	public ClienteEntity crearCliente (ClienteEntity cli) throws Exception;
	
	@Query( "select cl.primer_nombre from mydb.cliente cl, mydb.cuenta cu" + 
			"where cl.id_cliente = cu.id_cliente" + 
			"and cl.id_cliente=:idCliente")
	public void validacionCliente(@Param("idCliente")Integer idCliente);

	void eliminarCliente(BigInteger id);
	
	

}
