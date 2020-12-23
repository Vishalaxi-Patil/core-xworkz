package com.xworkz.sports;

import com.xworkz.sports.award.Ceremony;

public class SportsTester {

	public static void main(String[] args) {
		Ceremony ceremony=new Ceremony();
		System.out.println(ceremony.getName());
	    ceremony.setName("Agadi Fest");
	    System.out.println(ceremony.getName());
	    String[] foods= {"Dosa","mysore pak","laadu","eggrice"};
	    ceremony.setFoods(foods);
	    System.out.println(ceremony.getFoods());
	    ceremony.distributeAward("Aishu","Dronacharya");
	    ceremony.displayFoods();
	    ceremony.displayCeremonyNameAndFoods();
	    ceremony.accessParentMembers();
	    
	    
	    

	}

}
