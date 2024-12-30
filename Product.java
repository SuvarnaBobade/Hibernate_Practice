package com.ProductEntity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Product {
	@Id
	private int id;
	private String product_name;
	private String company_name;
	private long price;
	private float wgt;
	private Date Expiration_Date;
	private String Color;
	private String Brand;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String product_name, String company_name, long price, float wgt, Date expiration_Date,
			String color, String brand) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.company_name = company_name;
		this.price = price;
		this.wgt = wgt;
		Expiration_Date = expiration_Date;
		Color = color;
		Brand = brand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public float getWgt() {
		return wgt;
	}

	public void setWgt(float wgt) {
		this.wgt = wgt;
	}

	public Date getExpiration_Date() {
		return Expiration_Date;
	}

	public void setExpiration_Date(Date expiration_Date) {
		Expiration_Date = expiration_Date;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", product_name=" + product_name + ", company_name=" + company_name + ", price="
				+ price + ", wgt=" + wgt + ", Expiration_Date=" + Expiration_Date + ", Color=" + Color + ", Brand="
				+ Brand + "]";
	}
}
