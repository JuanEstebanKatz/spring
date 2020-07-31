package com.sohpos.service;

import java.math.BigInteger;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sohpos.entity.ClienteEntity;
import com.sohpos.repository.ClienteRepository;
import com.sohpos.repository.CuentaRepository;
import com.sohpos.util.Utilidades;

@Service
public class ClienteServiceImpl implements ClienteService {

	
	@Autowired
	ClienteRepository clienteRepo;
	
	@Autowired
	CuentaRepository cuentaRepo;
	
	@Autowired
	Utilidades utilidades;
	
	@Override
	public List<ClienteEntity> getClientes() {
		return (List<ClienteEntity>)clienteRepo.findAll();
	}

	@Override
	public ClienteEntity crearCliente(ClienteEntity cli) throws Exception {	
		try{
			if(cli != null) {
				if(utilidades.mayorEdad(cli.getFechaNacimiento())) {
					return clienteRepo.save(cli);
				}else {
					System.out.println("Usuario menor de edad");
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	/**
	 * @author JuanEsteban
	 */
	public String eliminarCliente(BigInteger idCliente) {
		if(cuentaRepo.findByClienteId(idCliente).isEmpty()) {
			clienteRepo.deleteById(idCliente);	
			return "Cliente borrado exitosamente";
		}else {
			return "Cliente posee cuentas no es posible la eliminacion";
		}
		
	}

	@Override
	public ClienteEntity modificarCliente(ClienteEntity cli) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		dateFormat.format(date);
		cli.setUsuarioModificacion(utilidades.USUARIOMODIFICACION);
		//cli.setFechaModificacion((java.sql.Date) date);
		return clienteRepo.save(cli);
	}

}
