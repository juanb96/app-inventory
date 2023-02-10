package com.example.appinventory.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.appinventory.dto.SupplierDTO;
import com.example.appinventory.models.Proveedores;
import com.example.appinventory.repository.ProveedorRepository;
import com.google.gson.Gson;

@Service
public class ProveedoresServicesJPA implements ProveedoresServicesImpl {
	
	@Autowired
	private ProveedorRepository proveedorRepo;

	@Override
	public String agregarProveedor(Object proveedor) {
		SupplierDTO supplierDTO = new Gson().fromJson(proveedor.toString(), SupplierDTO.class);
		Proveedores proveedores=new Proveedores();
		proveedores.setId(supplierDTO.getIdSupplier());
		proveedores.setCodigoProveedor(supplierDTO.getSupplierCode());
		proveedores.setNombreProveedor(supplierDTO.getSupplierName());
		proveedores.setNitProveedor(supplierDTO.getSupplierNit());
		proveedores.setNumeroContactoProveedor(supplierDTO.getSupplierContactNumber());
		proveedorRepo.save(proveedores);
		return "proveedor guardado";
	}

	
	
	
}
