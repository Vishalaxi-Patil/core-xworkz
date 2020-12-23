package com.xworkz.computers.computer;

public class LaptopComputer extends Computer{
	private double price;
	private boolean input;
	
	public boolean touchScreen(String start)
	{
		System.out.println("**************************");
		if(start.equals(input))
		{
			System.out.println("yes,my device has touchScreen");
		}else
		{
			System.out.println("No,its not touch screen");
		
	}
		return true;

	
}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isInput() {
		return input;
	}

	public void setInput(boolean input) {
		this.input = input;
	}
}
