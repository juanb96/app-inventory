package com.example.appinventory.services;

import com.example.appinventory.dto.ProductDTO;

public interface ProductosServicesImpl {
	
	public String agregarProducto(ProductDTO producto);
	public String agregarProducto2(Object producto);
	public String listarProductos();
	public String eliminarProducto(int id);
	//public String editarProducto(Object usersDTO, String Correo);


}
