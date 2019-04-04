package com.capgemini.capstore.beans;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "productdetail")
public class Product {

	@Id
	@Column(name = "productid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private int productId;
	
	@OneToOne
	@NotNull
	private Merchant merchant;
	
	@Column(name = "productname")
	@NotNull
	private String productName;
	@Column(name = "productimageurl")
	private String productImageUrl;
	@Column(name = "productcategory")
	@NotNull
	private Category productCategory;
	@Column(name = "productbrand")
	@NotNull
	private String productBrand;
	@Column(name = "productmodel")
	@NotNull
	private String productModel;
	@Column(name = "producttype")
	@NotNull
	private String productType;
	@Column(name = "productfeature")
	@NotNull
	private String productFeature;
	
	@Column(name = "productprice")
	@NotNull
	private double productPrice;
	
	@Column(name = "productquantity")
	@NotNull
	private int productQuantity;
	

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImageUrl() {
		return productImageUrl;
	}

	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}

	public Category getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(Category productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductModel() {
		return productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductFeature() {
		return productFeature;
	}

	public void setProductFeature(String productFeature) {
		this.productFeature = productFeature;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	

}
