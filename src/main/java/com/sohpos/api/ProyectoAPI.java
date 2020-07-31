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
	
	/////////// Para Cliente/////////////////
	
	@GetMapping ("/getcliente")
	public List<ClienteEntity> getClientes(){
		return clienteService.getClientes();
	}
	
	@PostMapping ("/crearcli")
	public ClienteEntity insertarCliente(@RequestBody ClienteEntity cli) throws Exception {
		return clienteService.crearCliente(cli);
	}
	
	@DeleteMapping (value = "eliminacli/{id}")  
	public String eliminar(@PathVariable("id") BigInteger id){
		return clienteService.eliminarCliente(id);	
	}
	
	@PutMapping ("/modificacli")
	public ClienteEntity modificar(@RequestBody ClienteEntity cli){
	  return clienteService.modificarCliente(cli);
	}
	
	////// Para Cuentas //////////////////

	@GetMapping ("/getcuenta")
	public List<CuentaEntity> getCuentas(){
		return cuentaService.obtenerCuentas();
	}

	@PostMapping ("/crearcuenta")
	public CuentaEntity crearCuenta(@RequestBody CuentaEntity cuenta) throws Exception {
		return cuentaService.crearCuenta(cuenta);
	}
	
	@DeleteMapping (value = "eliminacuenta/{id}")  
	public String eliminarCuenta(@PathVariable("id") BigInteger id){
		return cuentaService.eliminarCuenta(id);	
	}
	
	@PutMapping ("/modificacuenta")
	public CuentaEntity modificarCuenta(@RequestBody CuentaEntity cuenta){
	  return cuentaService.modificarCuenta(cuenta);
	}
	
	// Para Movimientos
	
	@GetMapping ("/getmovimientos")
	public List<MovimientosEntity> getMovimientos(){
		return movimientosService.getMovimientos();
	}
	
	@PostMapping ("/crearmovimiento")
	public MovimientosEntity crearMovimiento(@RequestBody MovimientosEntity mov){
		return movimientosService.crearMovimiento(mov);
	}
	
	// para pasar con parametros mirar este ejemplo eliminamovimiento/2
	@DeleteMapping (value = "eliminamovimiento")  
	public String eliminarMovimiento(@RequestBody MovimientosEntity mov){
		return movimientosService.eliminarMovimiento(mov);	
	}
	
	@PutMapping ("/modificamovimiento")
	public MovimientosEntity modificaMovimiento(@RequestBody MovimientosEntity mov){
	  return movimientosService.modificarMov(mov);
	}

}
