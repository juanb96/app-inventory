package com.example.appinventory.models;


import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "PRODUCTOS_PROVEEDORES")
public class ProductosProveedores implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id", name = "producto_id")
	private Producto producto;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id", name = "proveedor_id")
	private Proveedores proveedor;
	
	public ProductosProveedores() {
	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Proveedores getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedores proveedor) {
		this.proveedor = proveedor;
	}
	
	@Override
	public String toString() {
		return "ProductosProveedores [id=" + id + ", producto=" + producto + ", proveedor=" + proveedor + "]";
	}
	
	
	
	
}
