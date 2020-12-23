package com.xworkz.footwears;

import com.xworkz.footwears.footwear.FootWear;
import com.xworkz.footwears.footwear.ShoeFootWear;
import com.xworkz.footwears.footwear.constants.FootWearType;

public class FootWearTester {

	public static void main(String[] args) {
	   FootWear footWear=new FootWear();
	   footWear.setName("Lunar");
	   footWear.setPrice(1000);
	   footWear.setSize(10);
	   footWear.setFootWearType(FootWearType.SPORTS);
	   System.out.println(footWear.getName());
	   System.out.println(footWear.getPrice());
	   System.out.println(footWear.getSize());
	   System.out.println(footWear.getFootWearType());
	   ShoeFootWear shoeFootWear=new ShoeFootWear();
	   double dis=shoeFootWear.calculateDiscount();
	   System.out.println(dis);
	   footWear.displayDetails();
	   shoeFootWear.protect();
	  
		

	}

}
