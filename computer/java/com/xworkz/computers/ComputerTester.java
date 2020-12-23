package com.xworkz.computers;

import com.xworkz.computers.computer.Computer;
import com.xworkz.computers.computer.DekstopComputer;
import com.xworkz.computers.computer.LaptopComputer;

public class ComputerTester {

	public static void main(String[] args) {
	Computer computer=new DekstopComputer();
	computer.setComputerType("Dekstop");
	System.out.println(computer.getComputerType());
	computer.setSystemType(64);
	System.out.println(computer.getSystemType() +"GB");
	String[] inputDevice= {"KeyBoard","Mouse","Scanner","MicroPhone"};
	computer.setInputDevice(inputDevice);
	System.out.println(computer.getInputDevice());
	computer.takingInput();
	computer.update();
	Computer computer2=new LaptopComputer();
	LaptopComputer laptopComputer=(LaptopComputer)computer2;
	DekstopComputer dekstopComputer=new DekstopComputer();
	dekstopComputer.setOsName("Windows");
	System.out.println(dekstopComputer.getOsName());
	LaptopComputer laptopComputer2=new LaptopComputer();
	laptopComputer2.setPrice(450000);
	System.out.println(laptopComputer2.getPrice());
	laptopComputer2.setInput(true);
	laptopComputer2.touchScreen("true");
	//LaptopComputer laptopComputer3=new DekstopComputer();
	//LaptopComputer laptopComputer3=(LaptopComputer) new Computer();
	
	
	//if(laptopComputer3 instanceof Computer)
	//{
		//System.out.println("yes it is instance Computerr");
	//}else {
		//System.out.println("no its not instance of Comupter");
	//}
	
	
	
	Computer computer1=new LaptopComputer();
	//computer1=new DekstopComputer();
	
	if(computer1 instanceof LaptopComputer)
	{
		System.out.println("yes it is instance Computerr");
	}else {
		System.out.println("no its not instance of Comupter");
	}
	

	
	
	
	
}
}
