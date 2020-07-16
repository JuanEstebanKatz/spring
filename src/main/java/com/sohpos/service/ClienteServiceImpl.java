package com.sohpos.service;

import java.math.BigInteger;
import java.text.ParseException;
import java.util.List;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sohpos.entity.ClienteEntity;
import com.sohpos.repository.ClienteRepository;
import com.sohpos.util.Utilidades;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository clienteRepo;
	
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
	public void eliminarCliente(BigInteger id) {
		clienteRepo.deleteById(id);
		
	}

	@Override
	public void validacionCliente(Integer idCliente) {
		// TODO Auto-generated method stub
		
	}

}
