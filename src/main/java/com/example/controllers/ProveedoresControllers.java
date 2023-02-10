package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.appinventory.services.ProveedoresServicesImpl;

@RestController
@RequestMapping(value = "/proveedores")
public class ProveedoresControllers {
	
	@Autowired
	private ProveedoresServicesImpl rolesImpl;
	
	@PostMapping(value="/agregarprov")
	public String agregarProveedor(@RequestBody Object proovedor) {
		return rolesImpl.agregarProveedor(proovedor);
	}
	

}
