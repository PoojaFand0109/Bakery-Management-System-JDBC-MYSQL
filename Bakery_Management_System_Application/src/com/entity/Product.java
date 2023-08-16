package com.entity;

public class Product {
	
	private int productId;
	private String productName;
	private int productPrice;
	private int productQuality;
	
	public Product(int productId, String productName, int productPrice,int productQuality ) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuality = productQuality;
	}

	public Product(String productName, int productPrice, int productQuality) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuality = productQuality;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuality() {
		return productQuality;
	}

	public void setProductQuality(int productQuality) {
		this.productQuality = productQuality;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productQuality=" + productQuality + "]";
	}
	
	
	

}
