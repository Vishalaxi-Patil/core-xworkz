package com.xworkz.appliances;
import com.xworkz.appliances.cofeeday.CofeeMachine;
import com.xworkz.appliances.cofeeday.Power;

public class CofeeDayTester {

	public static void main(String[] args) {
		//Power power=new Power();
		CofeeMachine cofeeMachine=new CofeeMachine(new Power());
		boolean success=cofeeMachine.grind("Civet");
		if(success) {
			System.out.println("I know grinding was done");
		}else {
			System.out.println("Grinding was not done");
		}
		//CofeeMachine cofeeMachine2=new CofeeMachine(200);
		
		
		

	}

}
