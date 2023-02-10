package com.example.appinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.appinventory.models.Proveedores;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedores, Integer>{

}
