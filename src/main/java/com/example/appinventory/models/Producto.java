package com.example.appinventory.models;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;


import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToMany;

@Entity
@Table(name = "PRODUCTOS")

public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre_producto", nullable = false, unique = true)
	private String nombreProducto;
	@Column(name = "codigo_producto", nullable = false, unique = true)
	private String codigoProducto;
	@Column(name = "descripcion_producto", nullable = false)
	private String descripcionProducto;
	@Column(name = "unidad_medida", nullable = false)
	private String unidadMedida;
	@Column(name = "cantidad", nullable = false)
	private int cantidad;
	@Column(name = "precio_venta", nullable = false)
	private Double precioVenta;
	@Column(name = "precio_compra", nullable = false)
	private Double precioCompra;
	@Column(name = "fecha_compra", nullable = false)
	private Date fechaCompra;
	@Column(name = "fecha_venta", nullable = false)
	private Date fechaVenta;
	@ManyToMany
	@JoinTable(name = "productos_proveedores", joinColumns = @JoinColumn(name = "producto_id"), inverseJoinColumns = @JoinColumn(name = "proveedor_id"))
	private Set<Proveedores> proveedores = new HashSet<>();
	
	
	public Producto() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	public String getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public Double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(Double precioCompra) {
		this.precioCompra = precioCompra;
	}
	public Date getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public Date getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public Set<Proveedores> getProveedores() {
		return proveedores;
	}
	public void setProveedores(Set<Proveedores> proveedores) {
		this.proveedores = proveedores;
	}
	
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombreProducto=" + nombreProducto + ", codigoProducto=" + codigoProducto
				+ ", descripcionProducto=" + descripcionProducto + ", unidadMedida=" + unidadMedida + ", cantidad="
				+ cantidad + ", precioVenta=" + precioVenta + ", precioCompra=" + precioCompra + ", fechaCompra="
				+ fechaCompra + ", fechaVenta=" + fechaVenta + ", proveedores=" + proveedores + "]";
	}

	

}
