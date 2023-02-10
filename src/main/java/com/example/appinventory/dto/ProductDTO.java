package com.example.appinventory.dto;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	@JsonProperty(required = false)
	private int idProduct;
	
	@JsonProperty(required = false)
	private String productName;
	
	@JsonProperty(required = false)
	private String productCode;
	
	@JsonProperty(required = false)
	private String productDescription;
	
	@JsonProperty(required = false)
	private String unitOfMeasure;
	
	@JsonProperty(required = false)
	private int quantity;
	
	@JsonProperty(required = false)
	private Double salePrice;
	
	@JsonProperty(required = false)
	private Double purchasePrice;
	
	@JsonProperty(required = false)
	private Date purchaseDate;
	
	@JsonProperty(required = false)
	private Date saleDate;
	
	@JsonProperty(required = false)
	private List<SupplierDTO> suppliers;

	public ProductDTO() {
		
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public Double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	public List<SupplierDTO> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(List<SupplierDTO> suppliers) {
		this.suppliers = suppliers;
	}
	

	@Override
	public String toString() {
		return "ProductDTO [idProduct=" + idProduct + ", productName=" + productName + ", productCode=" + productCode
				+ ", productDescription=" + productDescription + ", unitOfMeasure=" + unitOfMeasure + ", quantity="
				+ quantity + ", salePrice=" + salePrice + ", purchasePrice=" + purchasePrice + ", purchaseDate="
				+ purchaseDate + ", saleDate=" + saleDate + ", suppliers=" + suppliers + "]";
	}
	
	
	
	
	
	
}
