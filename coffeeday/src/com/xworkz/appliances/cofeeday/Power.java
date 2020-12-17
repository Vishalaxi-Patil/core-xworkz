package com.xworkz.appliances.cofeeday;

public class Power {
	private int voltage=0;
	
	
	public Power()
	{
		System.out.println("Power called as default constructor");
	}
	public boolean generatePower()
	{
		this.voltage=200;
		return false;
	}

}
