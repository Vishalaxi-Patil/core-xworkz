package com.xworkz.appliances.cofeeday;

public class CofeeMachine {
	
	private Power power;
	
	public CofeeMachine()
	{
		System.out.println("CofeeMachine called as default constructor");
	}
	public CofeeMachine(Power power)
	{
		System.out.println("Init CofeeMachine");
		this.power=power;
	}
	public boolean grind(String bean) {
		System.out.println("invoked grind");
		if(bean!=null) {
			boolean generated=this.power.generatePower();
			if(generated) {
				System.out.println("Grinding::"+bean);
				return true;
			}else
			{
				System.out.println("not grinding");
				return false;
			}
		}else
			{
				System.out.println("Bean is not there");
				return false;
			}
		}
	}

