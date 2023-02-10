package com.example.appinventory.models;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "PROVEEDORES")

public class Proveedores implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre_proveedor", nullable = false, unique = true)
	private String nombreProveedor;
	@Column(name = "codigo_proveedor", nullable = false, unique = true)
	private String codigoProveedor;
	@Column(name = "nit_proveedor", nullable = false)
	private String nitProveedor;
	@Column(name = "numero_contacto_proveedor", nullable = false)
	private String numeroContactoProveedor;
	public Proveedores() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreProveedor() {
		return nombreProveedor;
	}
	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}
	public String getCodigoProveedor() {
		return codigoProveedor;
	}
	public void setCodigoProveedor(String codigoProveedor) {
		this.codigoProveedor = codigoProveedor;
	}
	public String getNitProveedor() {
		return nitProveedor;
	}
	public void setNitProveedor(String nitProveedor) {
		this.nitProveedor = nitProveedor;
	}
	public String getNumeroContactoProveedor() {
		return numeroContactoProveedor;
	}
	public void setNumeroContactoProveedor(String numeroContactoProveedor) {
		this.numeroContactoProveedor = numeroContactoProveedor;
	}

	@Override
	public String toString() {
		return "Proveedores [id=" + id + ", nombreProveedor=" + nombreProveedor + ", codigoProveedor=" + codigoProveedor
				+ ", nitProveedor=" + nitProveedor + ", numeroContactoProveedor=" + numeroContactoProveedor + "]";
	}
	
	
	
	

}