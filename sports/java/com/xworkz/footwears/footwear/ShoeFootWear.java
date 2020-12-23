package com.xworkz.footwears.footwear;

public class ShoeFootWear extends FootWear{
	
	public double calculateDiscount()
	{
		System.out.println("Invoked calculateDiscount");
		double price=super.getPrice();
		int discount=0;
		if(price>=1000) {
			discount=100;
			
		}if(price>=2000) {
			discount=200;
		}
		
		return discount;	
	}
	

}
