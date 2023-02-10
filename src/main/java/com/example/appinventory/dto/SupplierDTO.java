package com.example.appinventory.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SupplierDTO implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@JsonProperty(required = false)
	private int idSupplier;
	
	@JsonProperty(required = false)
	private String supplierName;
	
	@JsonProperty(required = false)
	private String supplierCode;
	
	@JsonProperty(required = false)
	private String supplierNit;
	
	@JsonProperty(required = false)
	private String supplierContactNumber;

	public SupplierDTO() {
		
	}

	public int getIdSupplier() {
		return idSupplier;
	}

	public void setIdSupplier(int idSupplier) {
		this.idSupplier = idSupplier;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getSupplierNit() {
		return supplierNit;
	}

	public void setSupplierNit(String supplierNit) {
		this.supplierNit = supplierNit;
	}

	public String getSupplierContactNumber() {
		return supplierContactNumber;
	}

	public void setSupplierContactNumber(String supplierContactNumber) {
		this.supplierContactNumber = supplierContactNumber;
	}

	@Override
	public String toString() {
		return "SupplierDTO [idSupplier=" + idSupplier + ", supplierName=" + supplierName + ", supplierCode="
				+ supplierCode + ", supplierNit=" + supplierNit + ", supplierContactNumber=" + supplierContactNumber
				+ "]";
	}
	
	
	
	
	
}
