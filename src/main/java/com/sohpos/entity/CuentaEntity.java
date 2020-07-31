package com.sohpos.entity;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="cuenta")
public class CuentaEntity {

	@Id
	@Column (name = "id_cuenta")
	private BigInteger idCuenta;
	
	@Column (name = "producto")
	private String producto;
	
	@Column (name = "estado_cuenta")
	private String estadoCuenta;
	
	@Column (name = "valor_credito")
	private String valorCredito;
	
	@Column (name = "fecha_apertura")
	private Date fecha_apertura;
	
	@Column (name = "fecha_creacion")
	private Date fecha_creacion;
	
	@Column (name = "usuario_creacion")
	private String usuarioCreacion;
	
	@Column (name = "fecha_modificacion")
	private Date fechaModificacion;
	
	
	@Column (name = "usuario_modificacion")
	private String usuarioModificacion;
	
	@Column (name = "id_cliente")
	private BigInteger clienteId;

	public BigInteger getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(BigInteger idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getEstadoCuenta() {
		return estadoCuenta;
	}

	public void setEstadoCuenta(String estadoCuenta) {
		this.estadoCuenta = estadoCuenta;
	}

	public String getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(String valorCredito) {
		this.valorCredito = valorCredito;
	}

	public Date getFecha_apertura() {
		return fecha_apertura;
	}

	public void setFecha_apertura(Date fecha_apertura) {
		this.fecha_apertura = fecha_apertura;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	public BigInteger getClienteId() {
		return clienteId;
	}

	public void setClienteId(BigInteger clienteId) {
		this.clienteId = clienteId;
	}


	
}

