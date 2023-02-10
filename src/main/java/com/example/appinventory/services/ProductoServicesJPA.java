package com.example.appinventory.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.appinventory.dto.ProductDTO;
import com.example.appinventory.models.Producto;
import com.example.appinventory.repository.ProductoRepository;
import com.google.gson.Gson;



@Service
public class ProductoServicesJPA implements ProductosServicesImpl{
	
	@Autowired
	private ProductoRepository productoRepo;
	
	private static final Gson gson = new Gson();

	@Override
	public String agregarProducto2(Object producto) {
		ProductDTO productDTO = gson.fromJson(producto.toString(), ProductDTO.class);
	    // Guardar el producto en la base de datos
	    Producto productos = new Producto();
	    productos.setNombreProducto(productDTO.getProductName());
	    productos.setCodigoProducto(productDTO.getProductCode());
	    productos.setDescripcionProducto(productDTO.getProductDescription());
	    productos.setUnidadMedida(productDTO.getUnitOfMeasure());
	    productos.setCantidad(productDTO.getQuantity());
	    productos.setPrecioVenta(productDTO.getSalePrice());
		productos.setPrecioCompra(productDTO.getPurchasePrice());
		productos.setFechaCompra(productDTO.getPurchaseDate());
		productos.setFechaVenta(productDTO.getSaleDate());
		productoRepo.save(productos);
		return "Producto guardado";
	}


	@Override
	public String eliminarProducto(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String agregarProducto(ProductDTO productoDTO) {
		Producto producto = new Producto();
		BeanUtils.copyProperties(productoDTO, producto);
		productoRepo.save(producto);
		return "Producto guardado";
	}


	@Override
	public String listarProductos() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
