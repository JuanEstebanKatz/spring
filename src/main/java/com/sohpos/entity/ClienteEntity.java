package com.sohpos.entity;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "cliente")
public class ClienteEntity {

	@Id
	@Column (name = "id_cliente")
	private BigInteger idCliente;
	
	@Column (name = "tipo_id")
	private String tipoId;
	
	@Column (name = "numero_id")
	private BigInteger numeroId;

	@Column (name = "estado_cliente")
	private String estadoCliente;
	
	@Column (name = "tipo_cliente")
	private String tipoCliente;
	
	@Column (name = "direccion")
	private String direccion;
	
	@Column (name = "telefono")
	private String telefono;
	
	@Column (name = "correo")
	private String correo;
	
	@Column (name = "primer_nombre")
	private String primerNombre;
	
	@Column (name = "segundo_nombre")
	private String segundoNombre;
	
	@Column (name = "primer_apellido")
	private String primerApellido;
	
	@Column (name = "segundo_apellido")
	private String segundoApellido;
	
	@Column (name = "fecha_nacimiento")
	private Date fechaNacimiento;
	
	@Column (name = "fecha_creacion")
	private Date fechaCreacion;
	
	@Column (name = "usuario_creacion")
	private String usuarioCreacion;
	
	@Column (name = "fecha_modificacion")
	private Date fechaModificacion;
	
	@Column (name = "usuario_modificacion")
	private String usuarioModificacion;

	public BigInteger getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(BigInteger idCliente) {
		this.idCliente = idCliente;
	}

	public String getTipoId() {
		return tipoId;
	}

	public void setTipoId(String tipoId) {
		this.tipoId = tipoId;
	}

	public BigInteger getNumeroId() {
		return numeroId;
	}

	public void setNumeroId(BigInteger numeroId) {
		this.numeroId = numeroId;
	}

	public String getEstadoCliente() {
		return estadoCliente;
	}

	public void setEstadoCliente(String estadoCliente) {
		this.estadoCliente = estadoCliente;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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
	
	
	
}
