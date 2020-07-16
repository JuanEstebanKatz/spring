package com.sohpos.api;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sohpos.entity.ClienteEntity;
import com.sohpos.entity.CuentaEntity;
import com.sohpos.entity.MovimientosEntity;
import com.sohpos.service.ClienteService;
import com.sohpos.service.CuentaService;
import com.sohpos.service.MovimientosService;

@RestController
@RequestMapping("/inicio")
public class ProyectoAPI {
	
	@Autowired
	public ClienteService clienteService;
	
	@Autowired
	public CuentaService cuentaService;
	
	@Autowired
	public MovimientosService movimientosService;
	
	@GetMapping ("/getcliente")
	public List<ClienteEntity> getClientes(){
		return clienteService.getClientes();
	}
	
	@PostMapping ("/crearcli")
	public ClienteEntity insertarCliente(@RequestBody ClienteEntity cli) throws Exception {
		return clienteService.crearCliente(cli);
	}
	
	@DeleteMapping (value = "eliminacli/{id}")  
	public void eliminar(@PathVariable("id") BigInteger id){
		clienteService.eliminarCliente(id);	
	}
	
	
	@GetMapping ("/getcuenta")
	public List<CuentaEntity> getCuentas(){
		return cuentaService.obtenerCuentas();
	}
	
	
	@GetMapping ("/getMovimientos")
	public List<MovimientosEntity> getMovimientos(){
		return movimientosService.getMovimientos();
	}

}
