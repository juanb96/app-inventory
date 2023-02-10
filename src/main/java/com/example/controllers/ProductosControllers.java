package com.example.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.appinventory.dto.ProductDTO;
import com.example.appinventory.services.ProductosServicesImpl;

@RestController
@RequestMapping(value = "/api")
public class ProductosControllers {
	
	@Autowired
	private ProductosServicesImpl productimpl;
	
	
	@PostMapping(value = "/agregar")
	public String AgregarProducto(@RequestBody ProductDTO productDTO) {
		return productimpl.agregarProducto(productDTO);
	}
	
	@PostMapping("/product")
    public ResponseEntity<String> agregarProducto(@RequestBody ProductDTO producto) {
        String mensaje = productimpl.agregarProducto(producto);
        return new ResponseEntity<>(mensaje, HttpStatus.CREATED);
    }
	
	

}
