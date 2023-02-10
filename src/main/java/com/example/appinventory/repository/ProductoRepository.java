package com.example.appinventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.appinventory.models.Producto;


@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer>{

	//public boolean existsBynombreProducto(String nombreproducto);
	//public List<Producto> findBynombreProducto(String nombreProducto);
	//public Producto getBydescripProducto(String nombre);
}
