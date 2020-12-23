package com.xworkz.computers.computer;

public class Computer {
     private String computerType;
     private int systemType;
     private String[] inputDevice;
     
     public void takingInput()
     {
    	System.out.println("*************************"); 
    	System.out.println("Invoked takingInput");
    	if(this.inputDevice!=null)
    	for(int z=0;z<this.inputDevice.length;z++)
    	{
    		System.out.println(this.inputDevice[z]);
    	}
     }
     
     public void update()
     
     {
    	 System.out.println("**********************");
    	 System.out.println("Invoked update");
     }
     
     public String getComputerType() {
		return computerType;
	}

	public void setComputerType(String computerType) {
		this.computerType = computerType;
	}

	public int getSystemType() {
		return systemType;
	}

	public void setSystemType(int systemType) {
		this.systemType = systemType;
	}

	public String[] getInputDevice() {
		return inputDevice;
	}

	public void setInputDevice(String[] inputDevice) {
		this.inputDevice = inputDevice;
	}

	

	
}