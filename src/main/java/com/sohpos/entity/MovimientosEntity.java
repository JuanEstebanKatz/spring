package com.sohpos.entity;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="movimientos")
public class MovimientosEntity {

	@Id
	@Column (name = "movimiento_id")
	private BigInteger movimientoId;
	
	@Column (name = "tipo")
	private String tipo;
	
	@Column (name = "valor")
	private BigInteger valor;
	
	@Column (name = "periodo")
	private String periodo;
	
	@Column (name = "estado")
	private String estado;
	
	@Column (name = "fecha_movimiento")
	private Date fechaMovimiento;
	
	@Column (name = "fecha_creacion")
	private Date fechaCreacion;
	
	@Column (name = "usuario_creacion")
	private String usuarioCreacion;
	
	@Column (name = "fecha_modificacion")
	private Date fechaModificacion;
	
	@Column (name = "usuario_modificacion")
	private String usuarioModificacion;
	
	@Column (name = "id_cuenta")
	private BigInteger cuentaId;

	public BigInteger getMovimientoId() {
		return movimientoId;
	}

	public void setMovimientoId(BigInteger movimientoId) {
		this.movimientoId = movimientoId;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigInteger getValor() {
		return valor;
	}

	public void setValor(BigInteger valor) {
		this.valor = valor;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaMovimiento() {
		return fechaMovimiento;
	}

	public void setFechaMovimiento(Date fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
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

	public BigInteger getCuentaId() {
		return cuentaId;
	}

	public void setCuentaId(BigInteger cuentaId) {
		this.cuentaId = cuentaId;
	}

}
