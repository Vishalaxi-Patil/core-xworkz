package com.xworkz.footwears.footwear;

import com.xworkz.footwears.footwear.constants.FootWearType;

public class FootWear {
	private int size;
	private String name;
	private String brand;
	private double price;
	private FootWearType footWearType;
	
	public void protect()
	{
		System.out.println("Invoked protected");
	}
	public void displayDetails() {
		System.out.println("invoked displayDetails");
		System.out.println(this.size);
		System.out.println(this.brand);
		System.out.println(this.price);
		System.out.println(this.footWearType);
	}

	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public FootWearType getFootWearType() {
		return footWearType;
	}
	public void setFootWearType(FootWearType footWearType) {
		this.footWearType = footWearType;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	

}
